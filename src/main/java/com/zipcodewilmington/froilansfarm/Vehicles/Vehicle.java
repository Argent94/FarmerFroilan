package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Persons.Rider;

public abstract class Vehicle<RiderType extends Rider>  {

    RiderType rider;

    public String makeNoise() {
        return "VROOM VROOM";
    }

    public void addRider(RiderType rider) {
    }

    public void removeRider() {
        rider = null;
    }

}
