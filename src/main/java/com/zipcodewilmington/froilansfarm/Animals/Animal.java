package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.NoiseMaker;

public abstract class Animal<Edible> implements Eater, NoiseMaker {
    public String getName() {
        return "hi";
    }
}
