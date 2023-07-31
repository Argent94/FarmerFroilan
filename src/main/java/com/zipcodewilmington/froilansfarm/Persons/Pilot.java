package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Rider;

import java.util.HashMap;
import java.util.Map;

public class Pilot extends Person implements Rider {
    private String name;
    private HashMap<String, Integer> foodEaten;
    private Boolean beenFed;
    private Boolean isRiding;
    private final HashMap<String, Integer> diet;

    public Pilot(){
        name = "";
        foodEaten = new HashMap<>();
        beenFed = false;
        isRiding = false;
        diet = new HashMap<>();

        diet.put("corn", 2);
        diet.put("tomato", 1);
        diet.put("egg", 2);
    }


    public void setName(String name) {
        this.name = name;

    }
    public String getName() {
        return name;
    }

    public Map<String, Integer> getFoodEaten() {
        return foodEaten;
    }

    public void setBeenFed(Boolean fed){
        beenFed = fed;
    }

    public Boolean getBeenFed() {
        return beenFed;
    }

    public void setIsRiding(Boolean riding){
        isRiding = riding;
    }

    public Boolean getIsRiding(){
        return isRiding;
    }

    public void mount(){
        isRiding = true;
    }

    public void dismount(){
        isRiding = false;
    }

    public Boolean isRidingCheck() {
        if (isRiding == true){
            return true;
        }
        return false;
    }
}
