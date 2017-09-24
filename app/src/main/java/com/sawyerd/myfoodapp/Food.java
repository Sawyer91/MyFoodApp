package com.sawyerd.myfoodapp;

/**
 * Created by Dmitriy on 23.09.2017.
 */

public class Food {
    private String name;
    private String description;

    public static final Food [] foods = {
            new Food("Pizza", "Thin crust pizza with cheese" ),
            new Food("Burger", "Best Burger" ),
            new Food("Sandvich", "Whole wheat sandwitch" ),
    };

    public Food(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String toString(){
        return this.name;
    }
}
