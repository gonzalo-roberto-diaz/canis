package com.canis.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.canis.dao.BreedsDAO;
import com.canis.domain.Breed;

@Service
@Transactional
public class BreedsServiceImpl implements BreedsService{
	
	@Resource
	BreedsDAO breedsDAO;
	

	public List<Breed> list(int offset, int limit) {
		return breedsDAO.list(offset, limit);
	}
	
	public long getCount() {
		return breedsDAO.getCount();
	}
	
	public Breed findById(long id) {
		return breedsDAO.findById(id);
	}
	
	public Breed findByName(String name) {
		return breedsDAO.findByName(name);
	}
	
	public void saveBreed(Breed user) {
		breedsDAO.save(user);
	}

	public void updateBreed(Breed user) {
		breedsDAO.update(user);
	}

	public void deleteBreedById(long id) {
		breedsDAO.delete(id);
	}

	public boolean isBreedExist(Breed user) {
		return findByName(user.getName())!=null;
	}




}
