package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.NoiseMaker;

import java.util.HashMap;

public abstract class Animal<Edible> implements Eater, NoiseMaker {

    private HashMap<String, Integer> foodEaten;

    public void eat(String edible, Integer i) {
    }

    public String makeNoise() {
        return "sound";
    }

    }


}
