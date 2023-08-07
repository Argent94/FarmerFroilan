package com.zipcodewilmington.froilansfarm.Field;

import java.util.Random;

public class TomatoPlant {
    private int yield;
public TomatoPlant() {

}
public int yield() {
    Random randomNum= new Random();
    int randomYield;
    randomYield= randomNum.nextInt(6);

    return randomYield;
}
    public boolean hasYieldCheck(){
        return yield > 0;
    }
    public int getYield (){
        return yield;
    }
    public void setYield(int yield){

        this.yield=yield;
    }


}
