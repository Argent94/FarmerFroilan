package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edible.Egg;
import com.zipcodewilmington.froilansfarm.Field.Produce;

import java.util.HashMap;

public class Chicken <Corn> extends Animal implements Produce<Egg> {
//    private Corn corn;
    //private  yield
    private HashMap foodEaten;
    private boolean beenFed;
    private String noise;
    final private Integer diet = 1;
    @Override
    public void yield() {

    }


    public Chicken () {
        this.foodEaten = new HashMap<String, Integer>();
        this.noise = "cluck";
        this.beenFed = false;


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
    public boolean fullCheck(Corn corn) {
        if (corn != null) {
            this.foodEaten.put(corn,diet);

            if( foodEaten.size() == 3) {
                this.beenFed = true;
                return true;
            }
        }
        return false;
    }
}
