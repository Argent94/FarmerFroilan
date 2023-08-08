package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edible.Egg;
import com.zipcodewilmington.froilansfarm.Field.Produce;

import java.util.HashMap;
import java.util.Map;

public class Chicken <Corn> extends Animal implements Produce<Egg> {
//    private Corn corn;
    //private  yield
    private HashMap<String, Integer> foodEaten;
    private boolean beenFed;
    private String noise;
    final private Integer diet = 1;
    @Override
    public int yield() {

        return 0;
    }


    public Chicken () {
        this.foodEaten = new HashMap<String, Integer>();
        this.noise = "cluck";
        this.beenFed = false;

        this.foodEaten.put("corn", 0);
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

    public boolean fullCheck() {
        if (foodEaten.get("corn") >= diet){
            return true;
        }
        return false;
    }

    public void eat(String food, Integer num) {
        foodEaten.put(food, foodEaten.get(food) + num);
    }

    public void emptyBelly(){
        foodEaten.put("corn", 0);
    }
}
