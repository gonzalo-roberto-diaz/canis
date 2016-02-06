package com.canis.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.canis.domain.DogBreed;
import com.canis.domain.Parent;

@Repository
@Transactional
public class ParentsDAOImpl implements ParentsDAO   {

	@PersistenceContext
	private EntityManager manager;

	/* (non-Javadoc)
	 * @see com.canis.dao.DogBreedsDAO#list(int, int)
	 */
	/* (non-Javadoc)
	 * @see com.canis.dao.ParentsDAO#list(int, int)
	 */
	public List<com.canis.domain.Parent> list(int offset, int limit) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Parent> criteria = builder.createQuery(Parent.class);
		Root<Parent> cat = criteria.from(Parent.class);
		criteria.select(cat).orderBy(builder.desc(cat.get("name")));
		
		TypedQuery<Parent> tq = manager.createQuery(criteria);
		tq.setFirstResult(offset);
		tq.setMaxResults(limit);
		List<Parent> breeds = tq.getResultList();
		return breeds;
	}
	
	/* (non-Javadoc)
	 * @see com.canis.dao.DogBreedsDAO#update(com.canis.domain.Breed)
	 */
	public void update(Parent newParent) {
		manager.merge(newParent);
	}
	
}
