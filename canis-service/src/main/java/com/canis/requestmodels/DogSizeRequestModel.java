package com.canis.requestmodels;


public class DogSizeRequestModel {
	

	private Long id;
	

	private String name;


    public Long getId() {
        return id;
    }

    public DogSizeRequestModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DogSizeRequestModel setName(String name) {
        this.name = name;
        return this;
    }


}
