package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animals.HorseClass;

import java.util.List;

public class Stable {
    private List<HorseClass> horses ;

    public Stable(List horses){
        this.horses = horses;
    }

    public void addAnimal (HorseClass horse) {
        horses.add(horse);
    }


}
