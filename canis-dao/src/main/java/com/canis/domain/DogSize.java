package com.canis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="DOG_SIZES")
public class DogSize {
	
	@Id
    @Column(name="ID")
	private Long id;
	
	@Column(name="NAME")
	private String name;

	public Long getId() {
		return id;
	}

	public DogSize setId(Long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public DogSize setName(String name) {
		this.name = name;
		return this;
	}
}
