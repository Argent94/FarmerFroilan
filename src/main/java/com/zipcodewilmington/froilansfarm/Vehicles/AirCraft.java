package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Rider;

public abstract class AirCraft<Pilot extends Rider> extends Vehicle<Pilot>{

    Pilot rider;

    public AirCraft(Pilot rider) {
        this.rider = rider;
    }

    protected AirCraft() {
    }

    @Override
    public void addRider(Pilot pilot) {

    }

    public String makeNoise() {
        return "whoosh";
    }


    public abstract void addRider(Object pilot);
}
