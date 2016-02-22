package com.canis.rest.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
 
     
    //-------------------Retrieve a list--------------------------------------------------------
     
    @RequestMapping(value = "/list/{offset}/{limit}", method = RequestMethod.GET)
    public ResponseEntity<List<DogBreed>> list(@PathVariable("offset") int offset, @PathVariable("limit") int limit) {
        List<DogBreed> Breeds = service.list(offset, limit);
        if(Breeds.isEmpty()){
            return new ResponseEntity<List<DogBreed>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<DogBreed>>(Breeds, HttpStatus.OK);
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
    public ResponseEntity<Void> create(@RequestBody DogBreed bean,    UriComponentsBuilder ucBuilder) {
 
        if (service.nameExists(bean.getName())) {
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
 
        service.saveBreed(bean);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/Breed/{id}").buildAndExpand(bean.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
 
     

     
    @RequestMapping(value = "/update/", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DogBreed> update(@RequestBody DogBreed breed) {
        System.out.println("Updating Breed " + breed.getId());
         
        DogBreed currentBreed = service.findById(breed.getId());
         
        if (currentBreed==null) {
            System.out.println("Breed with id " + breed.getId() + " not found");
            return new ResponseEntity<DogBreed>(HttpStatus.NOT_FOUND);
        }
 
        service.updateBreed(breed);
        return new ResponseEntity<DogBreed>(currentBreed, HttpStatus.OK);
    }
 
    //------------------- Delete a Breed --------------------------------------------------------
     
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<DogBreed> delete(@PathVariable("id") long id) {
 
        DogBreed Breed = service.findById(id);
        if (Breed == null) {
            return new ResponseEntity<DogBreed>(HttpStatus.NOT_FOUND);
        }
 
        service.deleteBreedById(id);
        return new ResponseEntity<DogBreed>(HttpStatus.NO_CONTENT);
    }
 
     
 
 
}
