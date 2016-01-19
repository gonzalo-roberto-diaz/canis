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

import com.canis.domain.Breed;

@Repository
@Transactional
public class BreedsDAOImpl implements BreedsDAO {

	@PersistenceContext
	private EntityManager manager;

	public List<com.canis.domain.Breed> list(int offset, int limit) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Breed> criteria = builder.createQuery(Breed.class);
		Root<Breed> cat = criteria.from(Breed.class);
		criteria.select(cat).orderBy(builder.desc(cat.get("name")));
		
		TypedQuery<Breed> tq = manager.createQuery(criteria);
		tq.setFirstResult(offset);
		tq.setMaxResults(limit);
		List<Breed> breeds = tq.getResultList();
		return breeds;
	}
	
	public long getCount() {
		CriteriaBuilder cb = manager.getCriteriaBuilder();
		CriteriaQuery<Long> cq = cb.createQuery(Long.class);
		cq.select(cb.count(cq.from(Breed.class)));

		TypedQuery<Long> tq = manager.createQuery(cq);
		long count = tq.getSingleResult();
		return count;
	}

	public Breed findById(long id) {
		return manager.find(Breed.class, id);
	}

	public Breed findByName(String name) {
		TypedQuery<Breed> query = manager.createQuery("SELECT b FROM com.canis.domain.Breed b where b.name = :name",
				Breed.class);
		query.setParameter("name", name);
		List<Breed> breeds = query.getResultList();
		if (breeds.isEmpty()) {
			return null;
		} else {
			return breeds.get(0);
		}

	}

	public boolean exists(Breed breed) {
		TypedQuery<Breed> query = manager.createQuery("SELECT b FROM com.canis.model.Breed b where b.name = :name",
				Breed.class);
		query.setParameter("name", breed.getName());
		List<Breed> breeds = query.getResultList();
		return !breeds.isEmpty();
	}

	public void update(Breed currentBreed) {
		manager.merge(currentBreed);
	}

	public void delete(long id) {
		 manager.createQuery("DELETE FROM com.canis.model.Breed where id=" + id).executeUpdate();
	}

	// public void deleteAllBreeds(){}

	public void save(Breed breed) {
		manager.persist(breed);
	}

}
