package com.canis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="BREEDS")
public class Breed {
	
	
	
	@Column(name="NAME")
	private String name;
	
	@Id
    @GeneratedValue
    @Column(name="ID")
	private Long id;
	
	
	public Breed() {}
	
	public Breed(Long id, String name){
		this.id=id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	   @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Breed other = (Breed) obj;
	        if (id != other.id)
	            return false;
	        return true;
	    }
	 
	    @Override
	    public String toString() {
	        return "Breed [id=" + id + ", name=" + name +  "]";
	    }

}
