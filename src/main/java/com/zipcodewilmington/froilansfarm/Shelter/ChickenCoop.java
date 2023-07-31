package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Persons.Person;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop extends Shelter<Chicken> {

    private List<Chicken> chikens;

    public ChickenCoop () {
        this.chikens = new ArrayList<>();
    }

    public void addAnimal (Chicken chicken) {

        chikens.add(chicken);
    }

    public Chicken getAnimal (Chicken chicken) {
        for (int i =  0 ; i  < chikens.size() ; i++) {
            if (chikens.get(i).equals(chicken)) {
                return chicken;
            }
        }
        return null;
    }

    public Integer getSize () {

        return chikens.size();
    }


    public void clear () {
        chikens.clear();
    }
}
