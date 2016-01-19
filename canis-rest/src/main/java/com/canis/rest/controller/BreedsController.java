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

import com.canis.domain.Breed;
import com.canis.service.BreedsService;
 
@RestController
@RequestMapping("/Breed")
public class BreedsController {
 
    @Autowired
    BreedsService breedService;  //Service which will do all data retrieval/manipulation work
 
     
    //-------------------Retrieve a list--------------------------------------------------------
     
    @RequestMapping(value = "/list/{offset}/{limit}", method = RequestMethod.GET)
    public ResponseEntity<List<Breed>> list(@PathVariable("offset") int offset, @PathVariable("limit") int limit) {
        List<Breed> Breeds = breedService.list(offset, limit);
        if(Breeds.isEmpty()){
            return new ResponseEntity<List<Breed>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Breed>>(Breeds, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public ResponseEntity<Long> getCount() {
        long count = breedService.getCount();
        return new ResponseEntity<Long>(count, HttpStatus.OK);
    }
 
 
    //-------------------Retrieve Single Breed--------------------------------------------------------
     
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Breed> get(@PathVariable("id") long id) {
        System.out.println("Fetching Breed with id " + id);
        Breed Breed = breedService.findById(id);
        if (Breed == null) {
            System.out.println("Breed with id " + id + " not found");
            return new ResponseEntity<Breed>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Breed>(Breed, HttpStatus.OK);
    }
 
     
     
    //-------------------Create a Breed--------------------------------------------------------
     
    @RequestMapping(value = "/create/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> create(@RequestBody Breed breed,    UriComponentsBuilder ucBuilder) {
        System.out.println("Creating Breed " + breed.getName());
 
        if (breedService.isBreedExist(breed)) {
            System.out.println("A Breed with name " + breed.getName() + " already exist");
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
 
        breedService.saveBreed(breed);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/Breed/{id}").buildAndExpand(breed.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
 
     
    //------------------- Update a Breed --------------------------------------------------------
     
    @RequestMapping(value = "/update/", method = RequestMethod.PUT)
    public ResponseEntity<Breed> update(@RequestBody Breed breed) {
        System.out.println("Updating Breed " + breed.getId());
         
        Breed currentBreed = breedService.findById(breed.getId());
         
        if (currentBreed==null) {
            System.out.println("Breed with id " + breed.getId() + " not found");
            return new ResponseEntity<Breed>(HttpStatus.NOT_FOUND);
        }
 
        currentBreed.setName(breed.getName());
//        currentBreed.setAge(breed.getAge());
//        currentBreed.setSalary(breed.getSalary());
         
        breedService.updateBreed(currentBreed);
        return new ResponseEntity<Breed>(currentBreed, HttpStatus.OK);
    }
 
    //------------------- Delete a Breed --------------------------------------------------------
     
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Breed> delete(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting Breed with id " + id);
 
        Breed Breed = breedService.findById(id);
        if (Breed == null) {
            System.out.println("Unable to delete. Breed with id " + id + " not found");
            return new ResponseEntity<Breed>(HttpStatus.NOT_FOUND);
        }
 
        breedService.deleteBreedById(id);
        return new ResponseEntity<Breed>(HttpStatus.NO_CONTENT);
    }
 
     
 
 
}
