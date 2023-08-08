package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Rider;

public class CropDuster<Pilot> extends AirCraft{

    Pilot rider;
    Boolean fertilize = null;

    Boolean hasRider = false;

    public CropDuster() {
        super();
    }

    public void setRider () {
        hasRider = true;
    }
    public boolean hasRiderCheck () {
        return hasRider;
    }

    public void fertilizing(){
        fertilize = true;
    }
    public Boolean getFertilize() {
        return fertilize;
    }
    @Override
    public void removeRider() {
        rider = null;
    }

    public CropDuster(Rider rider) {
        super(rider);
    }

    @Override
    public String makeNoise() {
        return super.makeNoise();
    }

    @Override
    public void addRider(Object pilot) {
        rider = (Pilot) pilot;
    }




}
