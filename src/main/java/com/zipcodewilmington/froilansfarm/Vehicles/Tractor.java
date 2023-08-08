package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Rideable;

import java.io.IOException;
import java.nio.CharBuffer;

public class Tractor<Farmer> extends Vehicle implements FarmVehicle {

    Farmer rider;
    Boolean hasRider = false;

    public Tractor() {
    }

    public void setRider() {
        hasRider = true;
    }

    public boolean hasRiderCheck() {
        return hasRider;
    }

    @Override
    public void removeRider() {
        rider = null;
    }

    @Override
    public String makeNoise() {
        return super.makeNoise();
    }

//    public void addRider(Object pilot) {
//        rider = (Farmer) pilot;
//    }

}
