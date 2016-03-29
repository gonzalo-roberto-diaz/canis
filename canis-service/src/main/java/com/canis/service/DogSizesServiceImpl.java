package com.canis.service;

import com.canis.dao.DogSizesDAO;
import com.canis.dao.DogTypesDAO;
import com.canis.domain.DogSize;
import com.canis.domain.DogType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class DogSizesServiceImpl implements DogSizesService {
	
	@Autowired
	private DogSizesDAO dogSizesDAO;


	public List<DogSize> findAll() {
		Iterable<DogSize> dogSizes = dogSizesDAO.findAll();
		List<DogSize> result = new ArrayList<>();
		for (DogSize size: dogSizes){
			result.add(size);
		}
		return result;
	}


	@Override
	public DogSize findById(long id) {
		return dogSizesDAO.findOne(id);
	}
	

	@Override
	public DogSize save(DogSize bean) {
		return dogSizesDAO.save(bean);
	}

	@Override
	public void delete(long id) {
		dogSizesDAO.delete(id);
	}

	public  void deleteAll(){
		dogSizesDAO.deleteAll();
	}
}
