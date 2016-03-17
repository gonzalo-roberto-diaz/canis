package com.canis.service;

import com.canis.dao.DogBreedsDAO;
import com.canis.dao.DogTypesDAO;
import com.canis.domain.DogBreed;
import com.canis.domain.DogType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class DogTypesServiceImpl implements DogTypesService {
	
	@Autowired
	DogTypesDAO dogTypesDAO;


	public List<DogType> findAll() {
		Iterable<DogType> dogTypes = dogTypesDAO.findAll();
		List<DogType> result = new ArrayList<DogType>();
		for (DogType type: dogTypes){
			result.add(type);
		}
		return result;
	}


	@Override
	public DogType findById(long id) {
		return dogTypesDAO.findOne(id);
	}
	

	@Override
	public DogType save(DogType bean) {
		return dogTypesDAO.save(bean);
	}

	@Override
	public void delete(long id) {
		dogTypesDAO.delete(id);
	}

	public  void deleteAll(){
		dogTypesDAO.deleteAll();
	}
}
