package com.canis.requestmodels;

import javax.persistence.*;


public class DogTypeRequestModel {
	

	private Long id;
	

	private String name;


	private int level;

	private DogTypeRequestModel parent;


    public Long getId() {
        return id;
    }

    public DogTypeRequestModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DogTypeRequestModel setName(String name) {
        this.name = name;
        return this;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public DogTypeRequestModel getParent() {
        return parent;
    }

    public void setParent(DogTypeRequestModel parent) {
        this.parent = parent;
    }
}
