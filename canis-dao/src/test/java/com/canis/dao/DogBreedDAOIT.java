package com.canis.dao;



import com.canis.config.JpaTestConfig;
import com.canis.domain.DogBreed;
import com.canis.domain.DogType;
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
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Gonzalo on 2/29/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JpaTestConfig.class)
@IntegrationTest
public class DogBreedDAOIT {

    @Autowired
    DogBreedsDAO repository;

    @Autowired
    DogTypesDAO typesRepository;


    @Test
    public void count(){
        assertEquals(repository.count(), 3);
    }

    @Test
    public void findAll(){
        Page<DogBreed> page = repository.findAll(new PageRequest(0, 100));
        assertNotNull(page);
        assertEquals(page.getTotalElements(), 3);
    }

    @Test
    public void testOrder(){
        PageRequest pageRequest = new PageRequest(0, 100, Sort.Direction.ASC, "name");
        Page<DogBreed> page = repository.findAll(pageRequest);
        DogBreed secondWithA = page.getContent().get(1);
        assertEquals(secondWithA.getName(), "Akita");
    }

    @Test
    public void delete(){
        //delete by whole reference
        DogBreed akita = repository.findByName("Akita");
        assertNotNull(akita);
        repository.delete(akita);
        assertEquals(repository.count(), 2);
        //delete by ID
        DogBreed bulldog = repository.findByName("Bulldog");
        assertNotNull(bulldog);
        repository.delete(bulldog.getId());
        assertEquals(repository.count(), 1);
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
        DogType primitivesType = new DogType().setId(6l);
        typesRepository.save(primitivesType);
        DogBreed akita = new DogBreed().setName("Akita").setDogType(primitivesType);
        repository.save(akita);

        DogType molossiansType = new DogType().setId(3l);
        typesRepository.save(molossiansType);
        DogBreed bulldog = new DogBreed().setName("Bulldog").setDogType(molossiansType);
        repository.save(bulldog);

        DogType pinschers = new DogType().setId(2l);
        typesRepository.save(pinschers);
        DogBreed affenpinscher = new DogBreed().setName("Affenpinscher").setDogType(pinschers);
        repository.save(affenpinscher);

        repository.save(akita);
        repository.save(bulldog);
        repository.save(affenpinscher);

    }

    @After
    public void tearDown(){

        repository.deleteAll();
        typesRepository.deleteAll();
    }

}
