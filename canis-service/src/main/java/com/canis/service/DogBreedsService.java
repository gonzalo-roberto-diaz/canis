package com.canis.service;

import java.util.List;

import com.canis.domain.DogBreed;

public interface DogBreedsService {

	List<DogBreed> list(int offset, int limit);

	long getCount();

	DogBreed findById(long id);

	void saveBreed(DogBreed user);

	void updateBreed(DogBreed user);

	void deleteBreedById(long id);

	boolean nameExists(String name);

}