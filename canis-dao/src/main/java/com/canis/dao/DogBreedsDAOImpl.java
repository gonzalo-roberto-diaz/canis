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

@Repository
@Transactional
public class DogBreedsDAOImpl   {

	@PersistenceContext
	private EntityManager manager;

	/* (non-Javadoc)
	 * @see com.canis.dao.DogBreedsDAO#list(int, int)
	 */
//	public List<com.canis.domain.DogBreed> list(int offset, int limit) {
//		CriteriaBuilder builder = manager.getCriteriaBuilder();
//		CriteriaQuery<DogBreed> criteria = builder.createQuery(DogBreed.class);
//		Root<DogBreed> cat = criteria.from(DogBreed.class);
//		criteria.select(cat).orderBy(builder.desc(cat.get("name")));
//
//		TypedQuery<DogBreed> tq = manager.createQuery(criteria);
//		tq.setFirstResult(offset);
//		tq.setMaxResults(limit);
//		List<DogBreed> breeds = tq.getResultList();
//		return breeds;
//	}
	
	/* (non-Javadoc)
	 * @see com.canis.dao.DogBreedsDAO#getCount()
	 */
//	public long getCount() {
//		CriteriaBuilder cb = manager.getCriteriaBuilder();
//		CriteriaQuery<Long> cq = cb.createQuery(Long.class);
//		cq.select(cb.count(cq.from(DogBreed.class)));
//
//		TypedQuery<Long> tq = manager.createQuery(cq);
//		long count = tq.getSingleResult();
//		return count;
//	}

	/* (non-Javadoc)
	 * @see com.canis.dao.DogBreedsDAO#findById(long)
	 */
//	public DogBreed findById(long id) {
//		return manager.find(DogBreed.class, id);
//	}

	/* (non-Javadoc)
	 * @see com.canis.dao.DogBreedsDAO#nameExists(java.lang.String)
	 */
	public boolean nameExists(String name) {
		TypedQuery<DogBreed> query = manager.createQuery("SELECT b FROM com.canis.model.DogBreed b where b.name = :name",
				DogBreed.class);
		query.setParameter("name", name);
		List<DogBreed> breeds = query.getResultList();
		return !breeds.isEmpty();
	}

	/* (non-Javadoc)
	 * @see com.canis.dao.DogBreedsDAO#update(com.canis.domain.Breed)
	 */
	public void update(DogBreed currentBreed) {
		manager.merge(currentBreed);
	}

	/* (non-Javadoc)
	 * @see com.canis.dao.DogBreedsDAO#delete(long)
	 */
	public void delete(long id) {
		 manager.createQuery("DELETE FROM com.canis.model.DogBreed where id=" + id).executeUpdate();
	}

	/* (non-Javadoc)
	 * @see com.canis.dao.DogBreedsDAO#save(com.canis.domain.Breed)
	 */
	public void save(DogBreed breed) {
		manager.persist(breed);
	}

}
