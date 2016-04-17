package com.canis.domain.enums;

/**
 * Created by Gonzalo on 4/16/2016.
 */
public enum DogSize {
    TOY(1), SMALL(2), MEDIUM(5), LARGE(7), XLARGE(8), GIANT(9);

    private int id;

     DogSize(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }

}
