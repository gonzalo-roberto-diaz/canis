package com.canis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="CHILDREN")
public class Child {
	
	@Id
	@GeneratedValue
    @Column(name="ID")
	public long id;
	
	@Column(name="NAME")
	public String name;

}
