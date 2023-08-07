package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Rider;

public abstract class AirCraft<Pilot extends Rider> extends Vehicle<Pilot>{

    Pilot rider;

    @Override
    public void addRider(Pilot pilot) {

    }

    public String makeNoise() {
        return "whoosh";
    }

    public abstract void addRider(Object pilot);
}
