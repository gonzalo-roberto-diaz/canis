package com.canis.rest.controller;


import com.canis.CanisRestApplication;
import com.canis.domain.DogBreed;
import com.canis.domain.DogType;
import com.canis.service.DogTypesService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import static java.util.Collections.emptyMap;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CanisRestApplication.class)
@WebAppConfiguration
@IntegrationTest({"server.port=0"})
@ActiveProfiles("test")
public class DogBreedsControllerIT {

    @Autowired
    DogTypesService dogTypesService;

    @Value("${local.server.port}")
    private int port;

    private URL base;
    private RestTemplate template;
    ResponseEntity<DogBreed> insertedAkita;
    ResponseEntity<DogBreed> insertedBulldog;

    @Before
    public void setUp() throws Exception {
        //add types for the breeds to be tested
        DogType molossers = new DogType().setId(3L);
        dogTypesService.save(molossers);

        DogType primitives = new DogType().setId(6L);
        dogTypesService.save(primitives);


        this.base = new URL("http://localhost:" + port + "/DogBreed");
        template = new TestRestTemplate();

        //post a couple. A reference to the return values is kept
        DogBreed akita = new DogBreed();
        akita.setName("Akita");
        akita.setDogType(new DogType().setId(6L));
        insertedAkita = template.postForEntity(base.toString().concat("/create/"), akita, DogBreed.class, emptyMap() );

        DogBreed bulldog = new DogBreed();
        bulldog.setName("Bulldog");
        bulldog.setDogType(new DogType().setId(3L));
        insertedBulldog = template.postForEntity(base.toString().concat("/create/"), bulldog, DogBreed.class, emptyMap() );
    }

    @After
    public void tearDown() throws Exception{
        ResponseEntity<List> response = template.getForEntity(base.toString() + "/list/0/100", List.class);
        for (Object d: response.getBody()){
            HashMap<String, Object> dogBreed = (HashMap<String, Object>)d;
            Integer id = (Integer)dogBreed.get("id");

            RequestEntity request = RequestEntity.delete(new URI(base.toString() + "/delete/" +  Integer.toString(id))).build();
            template.delete(base.toString() + "/delete/" +  Integer.toString(id));
        }
        dogTypesService.deleteAll();
    }



    @Test
    public void getList() throws Exception {
        ResponseEntity<List> response = template.getForEntity(base.toString() + "/list/0/100", List.class);
        assertThat(response.getBody().size(), equalTo(2));
        List<HashMap>  responseDogBreeds=  response.getBody();
        for (HashMap<String, String> dogBreedMap:responseDogBreeds ) {
            String name = dogBreedMap.get("name");
            assertThat(dogBreedMap.get("name"), anyOf(is("Akita"), is("Bulldog")));
        }
    }

    @Test
    public void get() throws Exception {
        ResponseEntity<DogBreed> response = template.getForEntity(base.toString() + "/get/" + insertedAkita.getBody().getId() , DogBreed.class);
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertEquals(response.getBody().getName(), "Akita");
    }

    @Test
    public void update() throws Exception {
        DogBreed newAkita = insertedAkita.getBody();
        newAkita.setName("New Akita");

        RequestEntity request = RequestEntity.put(new URI(base.toString() + "/update/")).accept(MediaType.APPLICATION_JSON).body(newAkita);
        //preferred over template.put because the response status can be checked
        ResponseEntity<DogBreed> res= template.exchange(request, DogBreed.class);
        assertEquals(res.getStatusCode(), HttpStatus.OK);
        assertEquals(res.getBody().getName(), "New Akita");


        DogBreed nonExistent = new DogBreed();
        nonExistent.setId(Long.MAX_VALUE);
        nonExistent.setName("Nonexistent name");
        request = RequestEntity.put(new URI(base.toString() + "/update/")).accept(MediaType.APPLICATION_JSON).body(nonExistent);
        res= template.exchange(request, DogBreed.class);
        assertEquals(res.getStatusCode(), HttpStatus.NOT_FOUND);

    }

    @Test
    public void remove() throws  Exception{
        RequestEntity request = RequestEntity.delete(new URI(base.toString() + "/delete/" + insertedAkita.getBody().getId())).build();
        ResponseEntity res= template.exchange(request, ResponseEntity.class);
        assertEquals(res.getStatusCode(), HttpStatus.NO_CONTENT);

        ResponseEntity<List> response = template.getForEntity(base.toString() + "/list/0/100", List.class);
        assertEquals(response.getBody().size(), 1);
    }

    @Test
    public void createWithExistingName() throws Exception{
        DogBreed newAkita = insertedAkita.getBody();
        newAkita.setName("Akita");

        RequestEntity request = RequestEntity.post(new URI(base.toString() + "/create/")).accept(MediaType.APPLICATION_JSON).body(newAkita);
        ResponseEntity<DogBreed> res= template.exchange(request, DogBreed.class);
        assertEquals(res.getStatusCode(), HttpStatus.BAD_REQUEST);
    }
}