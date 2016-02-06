package com.canis.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.canis.dao.DogBreedsDAO;
import com.canis.dao.ParentsDAO;
import com.canis.domain.DogBreed;
import com.canis.domain.Parent;

@Service
@Transactional
public class ParentServiceImpl implements ParentService {
	
	@Resource
	ParentsDAO parentsDAO;
	

	/* (non-Javadoc)
	 * @see com.canis.service.DogBreedsService#list(int, int)
	 */
	/* (non-Javadoc)
	 * @see com.canis.service.ParentService#list(int, int)
	 */
	public List<Parent> list(int offset, int limit) {
		return parentsDAO.list(offset, limit);
	}
	
	public void update(Parent newParent) {
		parentsDAO.update(newParent);
	}

}
