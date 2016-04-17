package com.canis.utils;


import com.canis.domain.DogBreed;
import com.canis.requestmodels.DogBreedRequestModel;
import com.canis.service.DogBreedsCalculations;
import com.canis.service.DogBreedsService;
import com.canis.mappers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CheckDogSizes implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(CheckDogSizes.class);

    @Autowired
    DogBreedsService dogBreedsService;

    @Autowired
    DogBreedsCalculations dogBreedsCalculations;

    @Override
    public void run(String... args) throws Exception {
        //updateCupSizes();
        updateDogSizes();
    }

    /**
     * this supposes 1 cup = 236.5 cc
     */
    public void updateCupSizes() {
        Page<DogBreed> breeds = dogBreedsService.read(0, 1000, "name");
        breeds.forEach(domain->{
            DogBreedRequestModel request = DogBreedMapper.domainToRequest(domain);

            dogBreedsCalculations.calculateServings(request);

            domain = DogBreedMapper.requestToDomain(request);
            logger.info("Dog Breed={} weight={}-{}, setting cups={}-{}", request.getName(), request.getWeightMin(), request.getWeightMax(), request.getServingMin(), request.getServingMax());
            dogBreedsService.save(domain);
        });
    }

    public void updateDogSizes() {
        Page<DogBreed> breeds = dogBreedsService.read(0, 1000, "name");
        breeds.forEach(domain->{
            DogBreedRequestModel request = DogBreedMapper.domainToRequest(domain);

            dogBreedsCalculations.calculateDogSize(request);

            domain = DogBreedMapper.requestToDomain(request);
            logger.info("Dog Breed={} weight={}-{}, setting size={}", domain.getName(), domain.getWeightMin(), domain.getWeightMax(), domain.getDogSize().getId());
            dogBreedsService.save(domain);
        });
    }





}
