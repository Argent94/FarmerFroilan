package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Persons.Person;

import java.util.ArrayList;
import java.util.List;

public class Stable extends Shelter<Horse> {
    private List<Horse> horses;
    private Horse riddingHorse ;

    public Stable(){

        this.horses = new ArrayList<>();
    }

    public void addAnimal (Horse horse) {

        horses.add(horse);
    }
    public Horse getAnimal (Horse horse) {
        for (int i =  0 ; i  < horses.size() ; i++) {
            if (horses.get(i).equals(horse)) {
                return horse;
            }
        }
        return null;
    }
    public Integer getSize () {

        return this.horses.size();
    }

    public void setRidingHorse (Horse horse) {
        riddingHorse = checkOutHorse();
    }
    public Horse getRidingHorse () {
        return riddingHorse;
    }

    public ArrayList getHorseList () {
        return (ArrayList) horses;
    }

    public Horse checkOutHorse() {

        for (int i = 0 ; i < horses.size() ; i ++) {
            riddingHorse = horses.get(i);
        }

        return riddingHorse;
    }
    public Integer checkInHorse () {

        for (int i = 0 ; i < horses.size() ; i ++) {
            horses.add(riddingHorse);
        }
        return getSize();
    }

    public void clear () {
        horses.clear();
    }

 }
