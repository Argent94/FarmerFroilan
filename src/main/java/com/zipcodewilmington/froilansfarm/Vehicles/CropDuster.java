package com.zipcodewilmington.froilansfarm.Vehicles;

public class CropDuster<Pilot> extends AirCraft{

    Pilot rider;


    @Override
    public void addRider(Pilot pilot) {
        rider = pilot;
    }
}
