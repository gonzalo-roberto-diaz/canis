package com.canis.domain;

import javax.persistence.*;

@Entity
@Table (name="DOG_TYPES")
public class DogType {
	
	@Id
    @Column(name="ID")
	private Long id;
	
	@Column(name="NAME")
	private String name;

	@Column(name="LEVEL")
	private int level;

	@ManyToOne
	@JoinColumn(name = "PARENT", referencedColumnName = "ID", nullable = true)
	private DogType parent;


    public Long getId() {
        return id;
    }

    public DogType setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public DogType getParent() {
        return parent;
    }

    public void setParent(DogType parent) {
        this.parent = parent;
    }
}
