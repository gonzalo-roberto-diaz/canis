package com.canis.service;

import com.canis.domain.DogType;

import java.util.List;

/**
 * Created by gdiaz on 3/17/16.
 */
public interface DogTypesService {

    public List<DogType> findAll();

    DogType findById(long id);

    DogType save(DogType bean);

    void delete(long id);

    void deleteAll();
}
