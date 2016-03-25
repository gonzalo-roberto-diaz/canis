package com.canis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	 * @see com.canis.service.DogBreedsService#read(int, int)
	 */
	public Page<DogBreed> read(int offset, int limit, String property) {
		Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC, property));
		return dogBreedsDAO.findAll(new PageRequest(offset, limit, sort));
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

	public Page<DogBreed> findByDogType(long dogTypeId, int offset, int limit, String sortProperty){
		Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC, sortProperty));
		return dogBreedsDAO.findByDogTypeId(new PageRequest(offset, limit, sort), dogTypeId);
	}

	public Page<DogBreed> readByNameSubstring(String nameSubstring, int offset, int limit, String sortProperty){
		Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC, sortProperty));
		PageRequest pageRequest = new PageRequest(offset, limit, sort);
		return dogBreedsDAO.findByNameSubstring("%".concat(nameSubstring.toUpperCase()).concat("%"), pageRequest);
	}

	public Page<DogBreed> readByNameInitialSubstring(String initialNameSubstring, int offset, int limit, String sortProperty){
		Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC, sortProperty));
		PageRequest pageRequest = new PageRequest(offset, limit, sort);
		return dogBreedsDAO.findByNameSubstring(initialNameSubstring.toUpperCase().concat("%"), pageRequest);
	}
}
