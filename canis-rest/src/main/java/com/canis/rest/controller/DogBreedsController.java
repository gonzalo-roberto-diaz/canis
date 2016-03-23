package com.canis.rest.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.canis.domain.DogBreed;
import com.canis.service.DogBreedsService;
 
@RestController
@RequestMapping("/DogBreed")
public class DogBreedsController {
 
    @Autowired
    DogBreedsService service;  //Service which will do all data retrieval/manipulation work


    @RequestMapping(value = "/readByDogType/{offset}/{limit}", method = RequestMethod.GET)
    public ResponseEntity<List<DogBreed>> readByDogType(@PathVariable("dogTypeId")long dogTypeId, @PathVariable("offset") int offset, @PathVariable("limit") int limit) {
        Page<DogBreed> breeds = service.findByDogType(dogTypeId, offset, limit, "name");
        if(!breeds.hasContent()){
            return new ResponseEntity<List<DogBreed>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<DogBreed>>(breeds.getContent(), HttpStatus.OK);
    }
     
    @RequestMapping(value = "/list/{offset}/{limit}", method = RequestMethod.GET)
    public ResponseEntity<List<DogBreed>> list(@PathVariable("offset") int offset, @PathVariable("limit") int limit) {
        Page<DogBreed> breeds = service.list(offset, limit, "name");
        if(!breeds.hasContent()){
            return new ResponseEntity<List<DogBreed>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<DogBreed>>(breeds.getContent(), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public ResponseEntity<Long> getCount() {
        long count = service.getCount();
        return new ResponseEntity<Long>(count, HttpStatus.OK);
    }
 
  
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DogBreed> get(@PathVariable("id") long id) {
        DogBreed bean = service.findById(id);
        if (bean == null) {
            return new ResponseEntity<DogBreed>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<DogBreed>(bean, HttpStatus.OK);
    }
 
     
    
    @RequestMapping(value = "/create/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DogBreed> create(@RequestBody DogBreed bean,    UriComponentsBuilder ucBuilder) {
 
        if (service.nameExists(bean.getName())) {
            return new ResponseEntity<DogBreed>(HttpStatus.BAD_REQUEST);
        }
 
        bean = service.save(bean);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/Breed/{id}").buildAndExpand(bean.getId()).toUri());
        return new ResponseEntity<DogBreed>(bean, HttpStatus.CREATED);
    }
 
     

     
    @RequestMapping(value = "/update/", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DogBreed> update(@RequestBody DogBreed breed) {
        System.out.println("Updating Breed " + breed.getId());
         
        DogBreed currentBreed = service.findById(breed.getId());
         
        if (currentBreed==null) {
            System.out.println("Breed with id " + breed.getId() + " not found");
            return new ResponseEntity<DogBreed>(HttpStatus.NOT_FOUND);
        }
 
        service.update(breed);
        return new ResponseEntity<DogBreed>(currentBreed, HttpStatus.OK);
    }
 
    //------------------- Delete a Breed --------------------------------------------------------
     
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> delete(@PathVariable("id") long id) {
 
        DogBreed Breed = service.findById(id);
        if (Breed == null) {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
 
        service.delete(id);
        //NO_CONTENT indicates success, but leaving the response deliberately empty
        return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
    }
 
     
 
 
}
