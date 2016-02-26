package com.canis.dao;

import java.util.List;

import com.canis.domain.DogBreed;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface DogBreedsDAO extends PagingAndSortingRepository<DogBreed, Long> {

	long getCount();

	DogBreed findById(long id);

    @Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM DPgBreed c WHERE c.name = :name")
    boolean nameExists(@Param("name") String companyName);

	void update(DogBreed currentBreed);

	void delete(long id);



}