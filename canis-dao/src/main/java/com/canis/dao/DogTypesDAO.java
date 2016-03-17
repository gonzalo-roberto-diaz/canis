package com.canis.dao;

import com.canis.domain.DogBreed;
import com.canis.domain.DogType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface DogTypesDAO extends CrudRepository<DogType, Long> {

}