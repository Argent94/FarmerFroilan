package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.List;

public class Stable {
    private List<Horse> horses ;

    public Stable(List horses){
        this.horses = horses;
    }

    public void addAnimal (Horse horse) {
        horses.add(horse);
    }

}
