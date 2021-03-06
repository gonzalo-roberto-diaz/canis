package com.canis.mappers;

import com.canis.CanisServiceApplication;
import com.canis.domain.DogBreed;
import com.canis.domain.DogType;
import com.canis.domain.enums.DogSize;
import com.canis.requestmodels.DogBreedRequestModel;
import com.canis.requestmodels.DogTypeRequestModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.math.BigDecimal;

/**
 * Created by Gonzalo on 3/27/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CanisServiceApplication.class)
@ActiveProfiles("test")
public class DogBreedMapperTest {

    @Test
    public void daoDomainToRestModel(){
        DogType type = new DogType().setId(3L).setName("Molossers");
        DogBreed dogBreed = new DogBreed()
                .setDogType(type)
                .setDogSize(DogSize.LARGE)
                .setActiveRank(3).setActiveText("Very active")
                .setWeightMax(BigDecimal.TEN)
                .setWeightMin(BigDecimal.ONE);
        DogBreedRequestModel model = DogBreedMapper.domainToRequest(dogBreed);

        assertEquals(model.getActiveRank(), dogBreed.getActiveRank());
        assertEquals(model.getWeightMax(), dogBreed.getWeightMax());
        assertEquals(model.getActiveRank(), dogBreed.getActiveRank());

        assertNotNull(model.getDogType());
        assertThat(model.getDogType(), instanceOf(DogTypeRequestModel.class));
        assertEquals(model.getDogType().getName(), "Molossers");

        assertNotNull(model.getDogSize());
        assertEquals(model.getDogSize(), DogSize.LARGE);

    }


}
