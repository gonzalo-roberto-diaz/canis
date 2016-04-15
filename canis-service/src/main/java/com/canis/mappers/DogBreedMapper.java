package com.canis.mappers;

import com.canis.domain.DogBreed;
import com.canis.domain.DogSize;
import com.canis.domain.DogType;
import com.canis.requestmodels.DogBreedRequestModel;
import com.canis.requestmodels.DogSizeRequestModel;
import com.canis.requestmodels.DogTypeRequestModel;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;

/**
 * Mapper between Dog Breed REST request models and JPA domain beans
 */
public class DogBreedMapper {

    public static DogBreedRequestModel domainToRequest(DogBreed domain){
        DogBreedRequestModel model = new DogBreedRequestModel();
        BeanUtils.copyProperties(domain, model);

        DogType dogType = domain.getDogType();
        DogTypeRequestModel dogTypeModel = new DogTypeRequestModel();
        BeanUtils.copyProperties(dogType, dogTypeModel);
        model.setDogType(dogTypeModel);

        DogSize dogSize = domain.getDogSize();
        if (dogSize != null) {
            DogSizeRequestModel dogSizeModel = new DogSizeRequestModel();
            BeanUtils.copyProperties(dogSize, dogSizeModel);
            model.setDogSize(dogSizeModel);
        }

        return model;
    }

    public static DogBreed requestToDomain(DogBreedRequestModel model){
        DogBreed domain = new DogBreed();
        BeanUtils.copyProperties(model, domain);

        DogTypeRequestModel dogTypeModel = model.getDogType();
        DogType dogType = new DogType();
        BeanUtils.copyProperties(dogTypeModel, dogType);
        domain.setDogType(dogType);

        DogSizeRequestModel dogSizeModel = model.getDogSize();
        if (dogSizeModel!=null) {
            DogSize dogSize = new DogSize();
            BeanUtils.copyProperties(dogSizeModel, dogSize);
            domain.setDogSize(dogSize);
        }

        return domain;
    }

    public static Page<DogBreedRequestModel> domainPageToRequestPage (Page<DogBreed> page){
        Page<DogBreedRequestModel> models = page.map(e->{
            DogBreedRequestModel model = domainToRequest(e);
            return model;
        });
        return models;
    }
}
