package com.canis.rest.controller;

/**
 * Tests for the Dog Breed controller
 * Created by Gonzalo on 3/3/2016.
 */

import com.canis.CanisRestApplication;
import com.canis.domain.DogBreed;
import com.canis.domain.DogSize;
import com.canis.domain.DogType;
import com.canis.requestmodels.DogBreedRequestModel;
import com.canis.rest.validator.DogBreedValidator;
import com.canis.service.DogBreedsService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import java.util.Arrays;
import java.util.Set;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CanisRestApplication.class)
@ActiveProfiles("test")
public class DogBreedsValidatorTest {

    private DogBreedValidator dogBreedValidator;
    private javax.validation.Validator validator;

    @Before
    public void setUp() {

        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        this.validator = vf.getValidator();
        dogBreedValidator = new DogBreedValidator();
    }

    @Ignore
    @Test
    public void nulls() throws Exception {
        DogBreedRequestModel model = new DogBreedRequestModel();
        Errors errors =  new BeanPropertyBindingResult(model, "DogBreedModel");
        dogBreedValidator.validate(model, errors);
        assertTrue(errors.hasErrors());
    }


    @Test
    public void annotationNulls() throws Exception {
        DogBreedRequestModel model = new DogBreedRequestModel();
        Set<ConstraintViolation<DogBreedRequestModel>> violations = this.validator.validate(model);
        assertFalse(violations.isEmpty());
    }

}
