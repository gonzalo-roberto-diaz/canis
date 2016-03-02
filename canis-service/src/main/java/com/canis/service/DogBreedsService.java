package com.canis.service;

import java.util.List;

import com.canis.domain.DogBreed;
import org.springframework.data.domain.Page;

public interface DogBreedsService {

	public Page<DogBreed> list(int offset, int limit);

	long getCount();

	DogBreed findById(long id);

	void save(DogBreed user);

	void update(DogBreed user);

	void delete(long id);

	boolean nameExists(String name);

}