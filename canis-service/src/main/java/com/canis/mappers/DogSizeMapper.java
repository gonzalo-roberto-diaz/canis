package com.canis.mappers;

import com.canis.domain.DogSize;
import com.canis.domain.DogType;
import com.canis.requestmodels.DogSizeRequestModel;
import com.canis.requestmodels.DogTypeRequestModel;
import org.springframework.beans.BeanUtils;

/**
 * Created by Gonzalo on 3/27/2016.
 */
public class DogSizeMapper {

    public static DogSizeRequestModel domainToRequest(DogSize domain){
        DogSizeRequestModel model = new DogSizeRequestModel();
        BeanUtils.copyProperties(domain, model);
        return model;
    }


}
