package com.canis.mappers;

import com.canis.domain.DogBreed;
import com.canis.domain.DogType;
import com.canis.requestmodels.DogBreedRequestModel;
import com.canis.requestmodels.DogTypeRequestModel;
import org.springframework.beans.BeanUtils;

/**
 * Created by Gonzalo on 3/27/2016.
 */
public class DogTypeMapper {

    public static DogTypeRequestModel domainToRequest(DogType domain){
        DogTypeRequestModel model = new DogTypeRequestModel();
        BeanUtils.copyProperties(domain, model);
        return model;
    }


}
