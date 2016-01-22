package com.canis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="DOG_PURPOSES")
public class DogPurpose {
	
	@Id
    @Column(name="ID")
	String id;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="DESCRIPTION")
	String description;
	
	@Column(name="ORDER")
	int order;
	
	@Column(name="PICTURE_URL")
	String pictureUrl;
	
	@Column(name="ENABLED")
	boolean enabled;

}
