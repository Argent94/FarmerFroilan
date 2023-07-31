package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse extends Shelter<Person> {
    private List<Person> house;

    public FarmHouse () {
        this.house = new ArrayList<>();
    }
    public void addAnimal (Person person) {
        house.add(person);
    }

    public Person getAnimal (Person person) {
        for (int i =  0 ; i  < house.size() ; i++) {
            if (house.get(i).equals(person)) {
                return person;
            }
        }
        return null;
    }
    public Integer getSize () {
        return house.size();
    }

    public void clear () {
        house.clear();
    }





}
