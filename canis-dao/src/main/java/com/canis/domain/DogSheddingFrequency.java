package com.canis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="DOG_SHEDDING_FREQUENCIES")
public class DogSheddingFrequency {
	
	@Id
    @Column(name="ID")
	String id;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="ORDER")
	int order;
	
	@Column(name="ENABLED")
	boolean enabled;

}
