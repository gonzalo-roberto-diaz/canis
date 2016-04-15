package com.canis.utils;


import com.canis.domain.DogBreed;
import com.canis.domain.DogSize;
import com.canis.service.DogBreedsService;
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

    @Override
    public void run(String... args) throws Exception {
        //updateCupSizes();
        //updateDogSizes();
        //reportToysAndGiants();
    }

    /**
     * this supposes 1 cup = 236.5 cc
     */
    public void updateCupSizes() {
        Page<DogBreed> breeds = dogBreedsService.read(0, 1000, "name");
        breeds.forEach(b->{
            BigDecimal minWeight = b.getWeightMin();
            BigDecimal maxWeight = b.getWeightMax();
            BigDecimal middleWeight = minWeight.add(maxWeight).divide(BigDecimal.valueOf(2));

            if (middleWeight.compareTo(BigDecimal.valueOf(34.5))>0){  //75+ lb
                b.setServingMin(BigDecimal.valueOf(2.50));
                b.setServingMax(BigDecimal.valueOf(4.00));
            }else if (middleWeight.compareTo(BigDecimal.valueOf(22.7))>0){  //50 - 75 lb
                b.setServingMin(BigDecimal.valueOf(2.00));
                b.setServingMax(BigDecimal.valueOf(2.50));
            }else if (middleWeight.compareTo(BigDecimal.valueOf(11.33))>0){  //25 - 50 lb lb
                b.setServingMin(BigDecimal.valueOf(1.00));
                b.setServingMax(BigDecimal.valueOf(2.00));
            }else if (middleWeight.compareTo(BigDecimal.valueOf(4.5))>0){  //10 - 25 lb
                b.setServingMin(BigDecimal.valueOf(0.75));
                b.setServingMax(BigDecimal.valueOf(1.00));
            }else{  // -10 lb
                b.setServingMin(BigDecimal.valueOf(0.25));
                b.setServingMax(BigDecimal.valueOf(0.75));
            }
            logger.info("Dog Breed={} weight={}-{}, setting cups={}-{}", b.getName(), b.getWeightMin(), b.getWeightMax(), b.getServingMin(), b.getServingMax());
            dogBreedsService.save(b);
        });
    }

    public void updateDogSizes() {
        DogSize toy = new DogSize().setId(1L);
        DogSize small = new DogSize().setId(2L);
        DogSize medium = new DogSize().setId(5L);
        DogSize large = new DogSize().setId(7L);
        DogSize xlarge = new DogSize().setId(8L);
        DogSize giant = new DogSize().setId(9L);

        Page<DogBreed> breeds = dogBreedsService.read(0, 1000, "name");
        breeds.forEach(b->{
            BigDecimal minWeight = b.getWeightMin();
            BigDecimal maxWeight = b.getWeightMax();
            BigDecimal middleWeight = minWeight.add(maxWeight).divide(BigDecimal.valueOf(2));

            if (middleWeight.compareTo(BigDecimal.valueOf(40.82))>0){  //90+ lb
                b.setDogSize(giant);
            }else if (middleWeight.compareTo(BigDecimal.valueOf(32.20))>0){  //71 - 90 lb
                b.setDogSize(xlarge);
            }else if (middleWeight.compareTo(BigDecimal.valueOf(18.60))>0){  //41 - 71 lb
                b.setDogSize(large);
            }else if (middleWeight.compareTo(BigDecimal.valueOf(11.80))>0){  //26 - 41 lb
                b.setDogSize(medium);
            }else if (middleWeight.compareTo(BigDecimal.valueOf(5.00))>0){  //11 - 26 lb
                b.setDogSize(small);
            }else{  // -10 lb
                b.setDogSize(toy);
            }
            logger.info("Dog Breed={} weight={}-{}, setting size={}", b.getName(), b.getWeightMin(), b.getWeightMax(), b.getDogSize().getId());
            dogBreedsService.save(b);
        });
    }


    public void reportToysAndGiants() {
        DogSize toy = new DogSize().setId(1L);
        DogSize small = new DogSize().setId(2L);
        DogSize medium = new DogSize().setId(5L);
        DogSize large = new DogSize().setId(7L);
        DogSize xlarge = new DogSize().setId(8L);
        DogSize giant = new DogSize().setId(9L);

        Page<DogBreed> breeds = dogBreedsService.read(0, 1000, "name");
        breeds.forEach(b->{
            if (b.getName().toLowerCase().contains("toy")   && !b.getDogSize().getId().equals(toy.getId())){
                logger.info("***  Dog Breed {} is not toy size but size {}", b.getName(), b.getDogSize().getId());
            }

            if (b.getName().toLowerCase().contains("giant")   && !b.getDogSize().getId().equals(giant.getId())){
                logger.info("***  Dog Breed {} is not giant size but size {}", b.getName(), b.getDogSize().getId());
            }
        });
    }


}
