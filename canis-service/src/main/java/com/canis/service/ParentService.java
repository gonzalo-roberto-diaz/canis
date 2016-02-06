package com.canis.service;

import java.util.List;

import com.canis.domain.DogBreed;
import com.canis.domain.Parent;

public interface ParentService {

	/* (non-Javadoc)
	 * @see com.canis.service.DogBreedsService#list(int, int)
	 */
	List<Parent> list(int offset, int limit);
	
	void update(Parent newParent);

}