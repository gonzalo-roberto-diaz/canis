package com.canis.dao;

import java.util.List;

import com.canis.domain.Breed;



public interface BreedsDAO
{
	List<Breed> list(int offset, int limit);
	
	long getCount();

	Breed findById(long id);
	
	public Breed findByName(String name);

	boolean exists(Breed breed);
	
	void update(Breed currentBreed);
	
	void delete(long id);
	
	
	void save(Breed breed);
}
