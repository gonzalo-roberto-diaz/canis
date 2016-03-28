package com.canis.mappers;

import com.canis.domain.DogBreed;
import com.canis.domain.DogType;
import com.canis.requestmodels.DogBreedRequestModel;
import com.canis.requestmodels.DogTypeRequestModel;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

/**
 * Created by Gonzalo on 3/27/2016.
 */
public class DogBreedMapper {

    public static DogBreedRequestModel domainToRequest(DogBreed domain){
        DogBreedRequestModel model = new DogBreedRequestModel();
        BeanUtils.copyProperties(domain, model);

        DogType dogType = domain.getDogType();
        DogTypeRequestModel dogTypeModel = new DogTypeRequestModel();
        BeanUtils.copyProperties(dogType, dogTypeModel);

        model.setDogType(dogTypeModel);

        return model;
    }


}
