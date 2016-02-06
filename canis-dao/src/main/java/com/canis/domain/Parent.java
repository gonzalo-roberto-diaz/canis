package com.canis.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonProperty;

@Entity
@Table (name="PARENTS")
public class Parent {
	
	@Id
	@GeneratedValue
    @Column(name="ID")
	public long id;
	
	@Column(name="NAME")
	public String name;
	
  @ManyToOne(fetch=FetchType.EAGER, optional= false, cascade = CascadeType.ALL )
  @JoinColumn(name = "CHILD_ID",referencedColumnName="ID",nullable=false)
  private Child child;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Child getChild() {
	return child;
}

public void setChild(Child child) {
	this.child = child;
}
  
  
	

}
