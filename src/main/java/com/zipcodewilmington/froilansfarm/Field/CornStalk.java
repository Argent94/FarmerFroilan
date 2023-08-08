package com.zipcodewilmington.froilansfarm.Field;


import com.zipcodewilmington.froilansfarm.Edible.Edible;

import java.util.Random;



public class CornStalk extends Crop{
    public CornStalk() {
        super();
    }

    private int yield;


    public int yield() {
        Random randomNum = new Random();
        int randomYield;
        randomYield = randomNum.nextInt(6);

        return randomYield;
    }

    public boolean hasYieldCheck() {
        return yield > 0;
    }

    public int getYield() {
        return yield;
    }


    public void setYield(int yield) {



        this.yield = yield;
    }
}

