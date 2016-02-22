package com.canis.dao;

import java.util.List;

import com.canis.domain.DogBreed;

public interface DogBreedsDAO {

	List<com.canis.domain.DogBreed> list(int offset, int limit);

	long getCount();

	DogBreed findById(long id);

	boolean nameExists(String name);

	void update(DogBreed currentBreed);

	void delete(long id);

	void save(DogBreed breed);

}