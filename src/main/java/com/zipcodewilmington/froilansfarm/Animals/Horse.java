package com.zipcodewilmington.froilansfarm.Animals;


import com.zipcodewilmington.froilansfarm.Rideable;

import java.util.HashMap;
import java.util.Map;

public class Horse<Corn> extends Animal implements Rideable {
    private HashMap<String, Integer> foodEaten;
    private boolean hasRider;
    private boolean beenRidden;
    private boolean beenFed;
    private String noise;
    final private Integer diet = 3;

    public Horse() {
        this.foodEaten = new HashMap<String, Integer>();
        this.noise = "neigh";
        this.beenRidden = false;
        this.beenFed = false;

        foodEaten.put("corn", 0);
    }

    public void setBeenRidden(boolean beenRidden) {
        this.beenRidden = beenRidden;
    }

    public boolean getBeenRidden() {
        return beenRidden;
    }

    public String makeNoise() {
        return this.noise;
    }

    public void setBeenFed(boolean beenFed) {
        this.beenFed = beenFed;
    }

    public boolean getBeenFed() {
        return this.beenFed;
    }

    public Map<String, Integer> getFoodEaten() {
        return foodEaten;
    }
    public void eat(String food, Integer num){
        foodEaten.put(food, foodEaten.get(food) + num);
    }

    public boolean fullCheck() {
        if (foodEaten.get("corn") >= diet){
            return true;
        }
        return false;
    }

    public void emptyBelly(){
        foodEaten.put("corn", 0);
    }
}