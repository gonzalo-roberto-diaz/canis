package com.canis.dao;

import java.util.List;

import com.canis.domain.Parent;

public interface ParentsDAO {

	/* (non-Javadoc)
	 * @see com.canis.dao.DogBreedsDAO#list(int, int)
	 */
	List<com.canis.domain.Parent> list(int offset, int limit);
	
	public void update(Parent newParent);

}