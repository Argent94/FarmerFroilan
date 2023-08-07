package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Edible.Edible;

public class Crop {
    private Integer yield;
    private Boolean readyToHarvest;

    public Crop() {
        this.yield = null;
        this.readyToHarvest = null;

    }

    public void yield(Edible edible) {

    }

    public int getYield() {
        return this.yield;
    }

    public void setYield(int yield) {
        this.yield = yield;
    }

    public boolean hasYieldCheck() {
        return false;
    }

    public void fertalizeCrop() {

    }

    public boolean beenFertalizedCheck() {
        return false;
    }


}
