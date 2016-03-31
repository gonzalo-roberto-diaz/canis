package com.canis.dao;



import com.canis.CanisDAOApplication;
import com.canis.domain.DogBreed;
import com.canis.domain.DogSize;
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
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;

/**
 * Integration tests for the Dog Breeds
 * Created by Gonzalo on 2/29/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CanisDAOApplication.class)
@IntegrationTest
@ActiveProfiles("test")
public class DogBreedDAOIT {

    @Autowired
    private DogBreedsDAO repository;

    @Autowired
    private DogTypesDAO typesRepository;

    @Autowired
    private DogSizesDAO sizesRepository;



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
    public void findByNameSubstring(){
        Page<DogBreed> akitaPage = repository.findByNameSubstring("%AKI%", new PageRequest(0, 100));
        assertNotNull(akitaPage);
        assertTrue(akitaPage.getTotalElements()>0);
        akitaPage.forEach(e ->{
            assertTrue(e.getName().toUpperCase().contains("AKI"));
          }
        );
    }


    @Test
    public void checkNameExisting(){
        DogBreed akita2 = new DogBreed();
        assertTrue(repository.nameExists("Akita"));
        assertFalse(repository.nameExists("Chihuahua"));
    }

    @Before
    public void setUp() {
        DogType primitivesType = new DogType().setId(6L);
        typesRepository.save(primitivesType);

        DogSize large = new DogSize().setId(7L).setName("large");
        sizesRepository.save(large);


        DogBreed akita = new DogBreed().setName("Akita").setDogType(primitivesType).setDogSize(large);
        repository.save(akita);

        DogType molossiansType = new DogType().setId(3L);
        typesRepository.save(molossiansType);
        DogBreed bulldog = new DogBreed().setName("Bulldog").setDogType(molossiansType).setDogSize(large);
        repository.save(bulldog);

        DogSize small = new DogSize().setId(2L).setName("small");
        sizesRepository.save(small);

        DogType pinschers = new DogType().setId(2L);
        typesRepository.save(pinschers);
        DogBreed affenpinscher = new DogBreed().setName("Affenpinscher").setDogType(pinschers).setDogSize(small);
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
