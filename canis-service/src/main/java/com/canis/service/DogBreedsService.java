package com.canis.service;

import java.util.List;

import com.canis.domain.DogBreed;
import com.canis.requestmodels.DogBreedRequestModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface DogBreedsService {

	public Page<DogBreed> read(int offset, int limit, String property);

	long getCount();

	DogBreed findById(long id);

	DogBreed save(DogBreed model);

	void update(DogBreed model);

	void delete(long id);

	boolean nameExists(String name);

	Page<DogBreed> findByDogType(long dogTypeId, int offset, int limit,  String sortProperty);

	Page<DogBreed> readByNameSubstring(String nameSubstring, int offset, int limit, String sortProperty);

	Page<DogBreed> readByNameInitialSubstring(String initialNameSubstring, int offset, int limit, String sortProperty);

}