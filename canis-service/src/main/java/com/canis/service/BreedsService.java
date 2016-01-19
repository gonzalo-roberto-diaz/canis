package com.canis.service;

import java.util.List;

import com.canis.domain.Breed;

public interface BreedsService {

	List<Breed> list(int offset, int limit);
	
	long getCount();

	Breed findById(long id);

	boolean isBreedExist(Breed breed);
	
	void updateBreed(Breed currentBreed);
	
	void deleteBreedById(long id);
	
	void saveBreed(Breed breed);

}
