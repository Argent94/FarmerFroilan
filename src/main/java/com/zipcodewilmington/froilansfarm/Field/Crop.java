package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Edible.Edible;

public class Crop <EdibleType extends Edible> implements Produce<Edible>{
    private int yield;


    private boolean readyToHarvest=false;

    public void Crop(){

    }
public int yield(){
return 0;
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
