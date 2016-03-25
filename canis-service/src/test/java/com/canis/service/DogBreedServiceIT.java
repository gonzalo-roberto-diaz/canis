package com.canis.service;


import com.canis.CanisServiceApplication;
import com.canis.domain.DogBreed;
import com.canis.domain.DogType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Gonzalo on 2/29/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CanisServiceApplication.class)
@IntegrationTest
@ActiveProfiles("test")
public class DogBreedServiceIT {

    @Autowired
    DogBreedsService service;

    @Autowired
    DogTypesService dogTypessService;


    void list(){
        Page<DogBreed> page = service.read(0, 100, "name");
        assertEquals(page.getNumberOfElements(), 2);
    }

    @After
    public void tearDown(){
        Page<DogBreed> page = service.read(0, 100, "name");
        List<DogBreed> beans = page.getContent();
        for (DogBreed bean: beans) {
            service.delete(bean.getId());
        }
        dogTypessService.deleteAll();
    }


    @Test
    public void count(){
        assertEquals(service.getCount(), 3);
    }

    @Test
    public void findAll(){
        Page<DogBreed> page = service.read(0, 100, "name");
        assertNotNull(page);
        assertEquals(page.getTotalElements(), 3);
    }


    @Test
    public void findByDogType(){
        Long primitives= 6L;
        Page<DogBreed> page = service.findByDogType(primitives, 0, 100,  "name");
        assertNotNull(page);
        assertEquals(page.getTotalElements(), 1);
        DogBreed akita = page.iterator().next();
        assertEquals("The dog type of the result should be primitives", akita.getDogType().getId(), primitives);
    }

    @Test
    public void findByDogNameSubstring(){
        String substring ="aki";
        Page<DogBreed> page = service.readByNameSubstring(substring,  0, 100, "name");
        assertNotNull(page);
        assertEquals(page.getTotalElements(), 1);
        DogBreed akita = page.iterator().next();
        assertTrue("The dog name does not contain the substring", akita.getName().toUpperCase().contains(substring.toUpperCase()));

        substring ="bull";
        page = service.readByNameSubstring(substring,  0, 100, "name");
        assertNotNull(page);
        assertEquals(page.getTotalElements(), 2);
    }

    @Test
    public void findByInitialNameSubstring(){
        String initialSubstring ="a";
        Page<DogBreed> page = service.readByNameInitialSubstring(initialSubstring,  0, 100, "name");
        assertNotNull(page);
        assertEquals(page.getTotalElements(), 1);
        DogBreed akita = page.iterator().next();
        assertTrue("The dog name does start with the substring", akita.getName().toUpperCase().contains(initialSubstring.toUpperCase()));
    }

    @Test
    public void delete(){
        //delete by whole reference
        DogBreed first = service.read(0, 100, "name").iterator().next();
        service.delete(first.getId());
        assertEquals(service.getCount(), 2);
    }

    @Test
    public void checkNameExisting(){
        DogBreed akita2 = new DogBreed();
        assertTrue(service.nameExists("Akita"));
        assertFalse(service.nameExists("Chihuahua"));
    }

    @Before
    public void setUp() {
        DogType primitivesType = new DogType().setId(6l);
        dogTypessService.save(primitivesType);
        DogBreed akita = new DogBreed().setName("Akita").setDogType(primitivesType);
        service.save(akita);

        DogType molossiansType = new DogType().setId(3l);
        dogTypessService.save(molossiansType);
        DogBreed bulldog = new DogBreed().setName("Bulldog").setDogType(molossiansType);
        service.save(bulldog);

        DogBreed bullmastiff = new DogBreed().setName("Bullaaamastiff").setDogType(molossiansType);
        service.save(bullmastiff);
    }


}
