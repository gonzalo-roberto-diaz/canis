package com.canis.dao;



import com.canis.config.JpaTestConfig;
import com.canis.domain.DogBreed;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Gonzalo on 2/29/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JpaTestConfig.class)
@IntegrationTest
public class DogBreedDAOITests {

    @Autowired
    DogBreedsDAO repository;

    @Test
    public void count(){
        assertEquals(repository.count(), 2);
    }

    @Test
    public void findAll(){
        Page<DogBreed> page = repository.findAll(new PageRequest(0, 100));
        assertNotNull(page);
        assertEquals(page.getTotalElements(), 2);
    }

    @Test
    public void delete(){
        //delete by whole reference
        DogBreed akita = repository.findByName("Akita");
        assertNotNull(akita);
        repository.delete(akita);
        assertEquals(repository.count(), 1);
        //delete by ID
        DogBreed bulldog = repository.findByName("Bulldog");
        assertNotNull(bulldog);
        repository.delete(bulldog.getId());
        assertEquals(repository.count(), 0);
    }

    @Test
    public void findByName(){
        DogBreed akita = repository.findByName("Akita");
        assertNotNull(akita);
        assertEquals(akita.getName(), "Akita");
    }


    @Test
    public void checkNameExisting(){
        DogBreed akita2 = new DogBreed();
        assertTrue(repository.nameExists("Akita"));
        assertFalse(repository.nameExists("Chihuahua"));
    }

    @Before
    public void setUp() {
        DogBreed dogBreed1 = new DogBreed();
        dogBreed1.setName("Akita");

        DogBreed dogBreed2 = new DogBreed();
        dogBreed2.setName("Bulldog");

        repository.save(dogBreed1);
        repository.save(dogBreed2);
    }

    @After
    public void tearDown(){
        repository.deleteAll();
    }

}
