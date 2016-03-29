package com.canis.service;

import com.canis.domain.DogSize;
import com.canis.domain.DogType;

import java.util.List;

/**
 * Created by gdiaz on 3/17/16.
 */
public interface DogSizesService {

    List<DogSize> findAll();

    DogSize findById(long id);

    DogSize save(DogSize bean);

    void delete(long id);

    void deleteAll();
}
