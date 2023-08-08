package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Rider;

public class CropDuster<Pilot> extends AirCraft{

    Pilot rider;
    Boolean fertilize = null;

    Boolean hasRider = false;
//+ makeNoise(): String
//+ addRider(Pilot)
//+ removeRider()
//+ hasRiderCheck() : boolean
//+ fertilize()

    public CropDuster() {
        super();
    }

    public void setRider(Pilot rider) {
        this.rider = rider;
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
        this.setRider((Pilot) pilot);
    }




}
