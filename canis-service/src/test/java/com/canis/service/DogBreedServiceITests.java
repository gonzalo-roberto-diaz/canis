package com.canis.service;


import com.canis.config.ServiceTestConfig;
import com.canis.domain.DogBreed;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Gonzalo on 2/29/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ServiceTestConfig.class)
@IntegrationTest
public class DogBreedServiceITests {

    @Autowired
    DogBreedsService service;

    void list(){
        Page<DogBreed> page = service.list(0, 100);
        assertEquals(page.getNumberOfElements(), 2);
    }

    @After
    public void tearDown(){
        Page<DogBreed> page = service.list(0, 100);
        List<DogBreed> beans = page.getContent();
        for (DogBreed bean: beans) {
            service.delete(bean.getId());
        }
    }


    @Test
    public void count(){
        assertEquals(service.getCount(), 2);
    }

    @Test
    public void findAll(){
        Page<DogBreed> page = service.list(0, 100);
        assertNotNull(page);
        assertEquals(page.getTotalElements(), 2);
    }

    @Test
    public void delete(){
        //delete by whole reference
        DogBreed first = service.list(0, 100).iterator().next();
        service.delete(first.getId());
        assertEquals(service.getCount(), 1);
    }

    @Test
    public void checkNameExisting(){
        DogBreed akita2 = new DogBreed();
        assertTrue(service.nameExists("Akita"));
        assertFalse(service.nameExists("Chihuahua"));
    }

    @Before
    public void setUp() {
        DogBreed dogBreed1 = new DogBreed();
        dogBreed1.setName("Akita");

        DogBreed dogBreed2 = new DogBreed();
        dogBreed2.setName("Bulldog");

        service.save(dogBreed1);
        service.save(dogBreed2);
    }


}
