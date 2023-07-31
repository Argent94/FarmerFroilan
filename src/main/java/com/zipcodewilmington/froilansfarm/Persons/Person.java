package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Animals.Animal;

import java.util.HashMap;
import java.util.Map;

public class Person<Edible> extends Animal {

    private String name;
    private HashMap<String, Integer> foodEaten;
    private Boolean beenFed;
    private Boolean isRiding;
    private final HashMap<String, Integer> diet;

    public Person(){
        name = "";
        foodEaten = new HashMap<>();
        beenFed = false;
        isRiding = false;
        diet = new HashMap<>();

        diet.put("corn", 2);
        diet.put("tomato", 2);
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

    public void eat(String food, Integer num){
        foodEaten.put(food, foodEaten.get(food) + num);
    }

    public boolean fullCheck() {
        if ((foodEaten.get("corn") >= diet.get("corn")) &&
                (foodEaten.get("tomato") >= diet.get("tomato")) &&
                        (foodEaten.get("tomato") >= diet.get("tomato"))){
            return true;
        }
        return false;
    }

    public void emptyBelly(){
        foodEaten.put("corn", 0);
        foodEaten.put("tomato", 0);
        foodEaten.put("egg", 0);
    }
}
