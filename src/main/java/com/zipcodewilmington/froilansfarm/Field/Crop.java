package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Edible.Edible;

public class Crop {

    private int yield;


    private boolean readyToHarvest=false;

    public Crop() {
        this.yield = null;
        this.readyToHarvest = null;

    }


public int getYield() {
        return yield;
}
public void setYield(int yield){
        this.yield=yield;
}
public boolean hasYieldCheck(){
    return yield > 0;
}
public void fertalizeCrop(){
readyToHarvest=true;
}
public boolean beenFertalizedCheck(){
        return readyToHarvest;
}


}
