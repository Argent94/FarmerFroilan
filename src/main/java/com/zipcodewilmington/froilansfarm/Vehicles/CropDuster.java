package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import com.zipcodewilmington.froilansfarm.Rider;

public class CropDuster<Pilot> extends AirCraft{

    Pilot rider;

    public CropDuster(){
        super();
    }

    @Override
    public void addRider(Object pilot) {
        rider = (Pilot) pilot;
    }


}
