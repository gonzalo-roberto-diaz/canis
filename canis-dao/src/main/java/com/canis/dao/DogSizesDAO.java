package com.canis.dao;

import com.canis.domain.DogSize;
import com.canis.domain.DogType;
import org.springframework.data.repository.CrudRepository;

public interface DogSizesDAO extends CrudRepository<DogSize, Long> {

}