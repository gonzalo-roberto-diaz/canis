package com.canis.service;

import com.canis.requestmodels.DogBreedRequestModel;

/**
 * Created by Gonzalo on 4/16/2016.
 */
public interface DogBreedsCalculations {

    void applyCalculations(DogBreedRequestModel model);

    void calculateServings(DogBreedRequestModel model);

    void calculateDogSize(DogBreedRequestModel model);


    void calculateJpgName(DogBreedRequestModel model);
}
