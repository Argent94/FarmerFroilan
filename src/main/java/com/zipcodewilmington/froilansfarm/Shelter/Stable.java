package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Persons.Person;

import java.util.ArrayList;
import java.util.List;

public class Stable extends Shelter<Horse> {
    private List<Horse> horses;
    private Horse ridingHorse;

    public Stable() {

        this.horses = new ArrayList<>();
    }

    public void addAnimal(Horse horse) {

        horses.add(horse);
    }


//    public Horse getAnimal(Horse horse) {
//        for (int i = 0; i < horses.size(); i++) {
//            if (horses.get(i).equals(horse)) {
//                return horse;
//            }
//        }
//        return null;
//    }

    public Integer getSize() {

        return this.horses.size();
    }

    public void setRidingHorse(Horse horse) {
        ridingHorse = horse;
    }

    public Horse getRidingHorse() {
        return ridingHorse;
    }

    public ArrayList getHorseList() {
        return (ArrayList) horses;
    }

    public void setHorseList(ArrayList<Horse> list) {
        horses = list;
    }

    public void checkOutHorse() {

        ridingHorse = horses.get(0);
        horses.remove(0);

    }

    public void checkInHorse() {
        horses.add(ridingHorse);

        ridingHorse = null;
    }

    public void clear() {
        horses.clear();
    }

}
