package com.canis.rest.controller;
 
import java.util.List;

import com.canis.mappers.DogBreedMapper;
import com.canis.requestmodels.DogBreedRequestModel;
import com.canis.rest.validator.DogBreedValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import com.canis.domain.DogBreed;
import com.canis.service.DogBreedsService;

import javax.validation.Valid;

@RestController
@RequestMapping("/DogBreed")
public class DogBreedsController {

    @InitBinder
    protected void initBinder(WebDataBinder binder){
        binder.setValidator(new DogBreedValidator());
    }
 
    @Autowired
    DogBreedsService service;  //Service which will do all data retrieval/manipulation work


    @RequestMapping(value = "/readByDogType/{dogTypeId}/{offset}/{limit}", method = RequestMethod.GET)
    public ResponseEntity<List<DogBreedRequestModel>> readByDogType(@PathVariable("dogTypeId")long dogTypeId, @PathVariable("offset") int offset, @PathVariable("limit") int limit) {
        Page<DogBreed> breeds = service.findByDogType(dogTypeId, offset, limit, "name");
        Page<DogBreedRequestModel> models = DogBreedMapper.domainPageToRequestPage(breeds);
        if(!breeds.hasContent()){
            return new ResponseEntity<List<DogBreedRequestModel>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<DogBreedRequestModel>>(models.getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/readByNameInitial/{initial}/{offset}/{limit}", method = RequestMethod.GET)
    public ResponseEntity<List<DogBreedRequestModel>> readByNameInitial(@PathVariable("initial")String initial, @PathVariable("offset") int offset, @PathVariable("limit") int limit) {
        Page<DogBreed> breeds = service.readByNameInitialSubstring(initial, offset, limit, "name");
        Page<DogBreedRequestModel> models = DogBreedMapper.domainPageToRequestPage(breeds);
        if(!breeds.hasContent()){
            return new ResponseEntity<List<DogBreedRequestModel>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<DogBreedRequestModel>>(models.getContent(), HttpStatus.OK);
    }

    @RequestMapping(value = "/readByNameSubstring/{substring}/{offset}/{limit}", method = RequestMethod.GET)
    public ResponseEntity<List<DogBreedRequestModel>> readByNameSubstring(@PathVariable("substring")String substring, @PathVariable("offset") int offset, @PathVariable("limit") int limit) {
        Page<DogBreed> breeds = service.readByNameSubstring(substring, offset, limit, "name");
        Page<DogBreedRequestModel> models = DogBreedMapper.domainPageToRequestPage(breeds);
        if(!breeds.hasContent()){
            return new ResponseEntity<List<DogBreedRequestModel>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<DogBreedRequestModel>>(models.getContent(), HttpStatus.OK);
    }


    @RequestMapping(value = "/read/{offset}/{limit}", method = RequestMethod.GET)
    public ResponseEntity<List<DogBreedRequestModel>> read(@PathVariable("offset") int offset, @PathVariable("limit") int limit) {
        Page<DogBreed> breeds = service.read(offset, limit, "name");
        Page<DogBreedRequestModel> models = DogBreedMapper.domainPageToRequestPage(breeds);
        if(!breeds.hasContent()){
            return new ResponseEntity<List<DogBreedRequestModel>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<DogBreedRequestModel>>(models.getContent(), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public ResponseEntity<Long> getCount() {
        long count = service.getCount();
        return new ResponseEntity<Long>(count, HttpStatus.OK);
    }
 
  
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DogBreedRequestModel> get(@PathVariable("id") long id) {
        DogBreed bean = service.findById(id);
        if (bean == null) {
            return new ResponseEntity<DogBreedRequestModel>(HttpStatus.NOT_FOUND);
        }
        DogBreedRequestModel model =  DogBreedMapper.domainToRequest(bean);
        return new ResponseEntity<DogBreedRequestModel>(model, HttpStatus.OK);
    }
 
     
    
    @RequestMapping(value = "/create/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DogBreedRequestModel> create(@RequestBody @Valid DogBreedRequestModel model,    UriComponentsBuilder ucBuilder) {

        if (service.nameExists(model.getName())) {
            return new ResponseEntity<DogBreedRequestModel>(HttpStatus.BAD_REQUEST);
        }

        DogBreed bean = DogBreedMapper.requestToDomain(model);
        bean = service.save(bean);

        model = DogBreedMapper.domainToRequest(bean);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/Breed/{id}").buildAndExpand(bean.getId()).toUri());
        return new ResponseEntity<DogBreedRequestModel>(model, HttpStatus.CREATED);
    }
 
     

     
    @RequestMapping(value = "/update/", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DogBreedRequestModel> update(@RequestBody @Valid DogBreedRequestModel model) {

        DogBreed dogBreed = DogBreedMapper.requestToDomain(model);

        DogBreed currentBreed = service.findById(dogBreed.getId());
         
        if (currentBreed==null) {
            System.out.println("Breed with id " + model.getId() + " not found");
            return new ResponseEntity<DogBreedRequestModel>(HttpStatus.NOT_FOUND);
        }

        service.update(dogBreed);

        model = DogBreedMapper.domainToRequest(dogBreed);

        return new ResponseEntity<DogBreedRequestModel>(model, HttpStatus.OK);
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
