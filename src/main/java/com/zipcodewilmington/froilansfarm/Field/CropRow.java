package com.zipcodewilmington.froilansfarm.Field;

import java.util.*;

public class CropRow <CropType extends Crop>  {
    private boolean beenPlantedCheck;


    public ArrayList <CropType> cropList;
    CropType produceType;
private int yieldRow;
private boolean beenFertilized=false;

private boolean beenHarvested;
public void CropRow(){

}
public CropType getProduce(){
    return produceType;
}
public void setProduce(CropType crop){
this.produceType=crop;
}
public int setYieldRow(int row){
    return 0;
}
public int getYieldRow(){
    return 0;
}
//public List<CropType>getCrops() { return null; }

public boolean beenPlantedCheck(){
    return beenPlantedCheck;
}
public void fertalizeRow(){
beenFertilized=true;
}
    public boolean beenFertalizedCheck(){
        return beenFertilized;
    }
public void harvestRow(){
beenHarvested=true;
}
    public boolean beenHarvesedCheck(){
        return beenHarvested;
    }


    public boolean isEmpty() {
    return true;
    }
}
