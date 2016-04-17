package com.canis.service;


import com.canis.CanisServiceApplication;
import com.canis.domain.DogBreed;
import com.canis.domain.DogType;
import com.canis.domain.enums.DogSize;
import com.canis.requestmodels.DogBreedRequestModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CanisServiceApplication.class)
@ActiveProfiles("test")
public class DogBreedCalculationsTest {

    @Autowired
    private DogBreedsCalculations dogBreedsCalculations;


    @Test
    public void nameCalculation(){
        DogBreedRequestModel model = new DogBreedRequestModel();
        model.setName("A Beautiful Breed");
        dogBreedsCalculations.calculateJpgName(model);
        assertEquals(model.getPictureUrl(), "a_beautiful_breed.jpg");
    }

    @Test
    public void sizeCalculation(){
        DogBreedRequestModel model = new DogBreedRequestModel();
        model.setWeightMin(BigDecimal.valueOf(25.00));
        model.setWeightMax(BigDecimal.valueOf(30.00));
        dogBreedsCalculations.calculateDogSize(model);
        assertEquals(model.getDogSize(), DogSize.LARGE);
    }

    @Test
    public void servingCalculation(){
        DogBreedRequestModel model = new DogBreedRequestModel();
        model.setWeightMin(BigDecimal.valueOf(25.00));
        model.setWeightMax(BigDecimal.valueOf(30.00));
        dogBreedsCalculations.calculateServings(model);
        assertEquals(model.getServingMin(), BigDecimal.valueOf(2.00));
        assertEquals(model.getServingMax(), BigDecimal.valueOf(2.50));
    }

}
