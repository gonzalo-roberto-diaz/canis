package com.canis.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.canis.dao.DogBreedsDAO;
import com.canis.domain.DogBreed;

@Service
@Transactional
public class DogBreedsServiceImpl implements DogBreedsService{
	
	@Autowired
	DogBreedsDAO dogBreedsDAO;
	

	/* (non-Javadoc)
	 * @see com.canis.service.DogBreedsService#list(int, int)
	 */
	public Page<DogBreed> list(int offset, int limit) {
		return dogBreedsDAO.findAll(new PageRequest(offset, limit));
	}
	
	/* (non-Javadoc)
	 * @see com.canis.service.DogBreedsService#getCount()
	 */
	public long getCount() {
		return dogBreedsDAO.count();
	}
	
	/* (non-Javadoc)
	 * @see com.canis.service.DogBreedsService#findById(long)
	 */
	public DogBreed findById(long id) {
		return dogBreedsDAO.findById(id);
	}
	
	/* (non-Javadoc)
	 * @see com.canis.service.DogBreedsService#saveBreed(com.canis.domain.DogBreed)
	 */
	public DogBreed save(DogBreed user) {
		return dogBreedsDAO.save(user);
	}

	/* (non-Javadoc)
	 * @see com.canis.service.DogBreedsService#delete(long)
	 */
	public void delete(long id) {
		dogBreedsDAO.delete(id);
	}

	/* (non-Javadoc)
	 * @see com.canis.service.DogBreedsService#nameExists(java.lang.String)
	 */
	public boolean nameExists(String name) {
		return dogBreedsDAO.nameExists(name);
	}

	public void update(DogBreed dogBreed) {
		dogBreedsDAO.save(dogBreed);
	}
}
