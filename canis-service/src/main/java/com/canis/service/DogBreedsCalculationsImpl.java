package com.canis.service;

import com.canis.dao.DogBreedsDAO;
import com.canis.domain.DogBreed;
import com.canis.domain.enums.DogSize;
import com.canis.requestmodels.DogBreedRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class DogBreedsCalculationsImpl implements DogBreedsCalculations {

    @Override
    public void applyCalculations(DogBreedRequestModel model){
        calculateServings(model);
        calculateDogSize(model);
        calculateJpgName(model);
    }


	public void calculateServings(DogBreedRequestModel model){
		if (model.getServingMax() != null && model.getServingMin() != null ){
			return;
		}
		BigDecimal minWeight = model.getWeightMin();
		BigDecimal maxWeight = model.getWeightMax();
		BigDecimal middleWeight = minWeight.add(maxWeight).divide(BigDecimal.valueOf(2));

		if (middleWeight.compareTo(BigDecimal.valueOf(34.5))>0){  //75+ lb
			model.setServingMin(BigDecimal.valueOf(2.50));
			model.setServingMax(BigDecimal.valueOf(4.00));
		}else if (middleWeight.compareTo(BigDecimal.valueOf(22.7))>0){  //50 - 75 lb
			model.setServingMin(BigDecimal.valueOf(2.00));
			model.setServingMax(BigDecimal.valueOf(2.50));
		}else if (middleWeight.compareTo(BigDecimal.valueOf(11.33))>0){  //25 - 50 lb lb
			model.setServingMin(BigDecimal.valueOf(1.00));
			model.setServingMax(BigDecimal.valueOf(2.00));
		}else if (middleWeight.compareTo(BigDecimal.valueOf(4.5))>0){  //10 - 25 lb
			model.setServingMin(BigDecimal.valueOf(0.75));
			model.setServingMax(BigDecimal.valueOf(1.00));
		}else{  // -10 lb
			model.setServingMin(BigDecimal.valueOf(0.25));
			model.setServingMax(BigDecimal.valueOf(0.75));
		}
	}

    public void calculateDogSize(DogBreedRequestModel model){
        if (model.getDogSize()!=null){
            return;
        }



        BigDecimal minWeight = model.getWeightMin();
        BigDecimal maxWeight = model.getWeightMax();
        BigDecimal middleWeight = minWeight.add(maxWeight).divide(BigDecimal.valueOf(2));

        if (middleWeight.compareTo(BigDecimal.valueOf(40.82))>0){  //90+ lb
            model.setDogSize(DogSize.GIANT);
        }else if (middleWeight.compareTo(BigDecimal.valueOf(32.20))>0){  //71 - 90 lb
            model.setDogSize(DogSize.XLARGE);
        }else if (middleWeight.compareTo(BigDecimal.valueOf(18.60))>0){  //41 - 71 lb
            model.setDogSize(DogSize.LARGE);
        }else if (middleWeight.compareTo(BigDecimal.valueOf(11.80))>0){  //26 - 41 lb
            model.setDogSize(DogSize.MEDIUM);
        }else if (middleWeight.compareTo(BigDecimal.valueOf(5.00))>0){  //11 - 26 lb
            model.setDogSize(DogSize.SMALL);
        }else{  // -10 lb
            model.setDogSize(DogSize.TOY);
        }
    }

    public void calculateJpgName(DogBreedRequestModel model){
        if (model.getPictureUrl() != null){
            return;
        }

        String jpgName = model.getName().replace(" ", "_").toLowerCase().concat(".jpg");
        model.setPictureUrl(jpgName);

    }


}
