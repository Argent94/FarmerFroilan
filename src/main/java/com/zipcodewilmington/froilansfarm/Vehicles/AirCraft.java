package com.zipcodewilmington.froilansfarm.Vehicles;

public abstract class AirCraft<Pilot> extends Vehicle{

    Pilot rider;

    public void addRider(Pilot pilot) {
        rider = pilot;
    }

    public String makeNoise() {
        return "whoosh";
    }

    public abstract void addRider(Object pilot);
}
