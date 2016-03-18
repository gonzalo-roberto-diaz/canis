package com.canis.service;

import java.util.List;

import com.canis.domain.DogBreed;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface DogBreedsService {

	public Page<DogBreed> list(int offset, int limit, String property);

	long getCount();

	DogBreed findById(long id);

	DogBreed save(DogBreed user);

	void update(DogBreed user);

	void delete(long id);

	boolean nameExists(String name);

	Page<DogBreed> findByDogType(long dogTypeId, int offset, int limit,  String sortProperty);

	Page<DogBreed> findByNameSubstring(String nameSubstring, int offset, int limit, String sortProperty);

}