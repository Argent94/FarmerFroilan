package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable extends Shelter<Horse> {
    private List<Horse> horses;

    public Stable(){
        this.horses = new ArrayList<>();
    }

    public void addAnimal (Horse horse) {
        horses.add(horse);
    }
    public Integer getSize () {
        return this.horses.size();
    }

    public void feeding () {

    }
    public Integer checkOutHorse() {

        return null;
    }
    public Integer checkInHorse () {

        return null;
    }

    public void clear () {
        horses.clear();
    }

 }
