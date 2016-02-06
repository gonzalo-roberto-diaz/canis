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
import com.canis.domain.Parent;
import com.canis.service.DogBreedsService;
import com.canis.service.ParentService;
 
@RestController
@RequestMapping("/Parent")
public class ParentsController {
 
    @Autowired
    ParentService service;  //Service which will do all data retrieval/manipulation work
     
    @RequestMapping(value = "/list/{offset}/{limit}", method = RequestMethod.GET)
    public ResponseEntity<List<Parent>> list(@PathVariable("offset") int offset, @PathVariable("limit") int limit) {
        List<Parent> Breeds = service.list(offset, limit);
        if(Breeds.isEmpty()){
            return new ResponseEntity<List<Parent>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Parent>>(Breeds, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/update/", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Parent> update(@RequestBody Parent newParent) {
        System.out.println("Updating Parent " + newParent.getId());
         
        //DogBreed currentBreed = service.findById(breed.getId());
         
//        if (currentBreed==null) {
//            System.out.println("Breed with id " + breed.getId() + " not found");
//            return new ResponseEntity<DogBreed>(HttpStatus.NOT_FOUND);
//        }
 
        service.update(newParent);
        return new ResponseEntity<Parent>(newParent, HttpStatus.OK);
    }
    
 
}
