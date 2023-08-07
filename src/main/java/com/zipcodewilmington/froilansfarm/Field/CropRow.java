package com.zipcodewilmington.froilansfarm.Field;

import java.util.*;

public class CropRow <CropType extends Crop>  {
    ArrayList <CropType> cropList;
    CropType produceType;
private int yieldRow;


public void CropRow(){

}
public CropType getProduce(){
    return null;
}
public void setProduce(CropType crop){

}
public int setYieldRow(int row){
    return 0;
}
public int getYieldRow(){
    return 0;
}
//public List<CropType>getCrops() { return null; }

public boolean beenPlantedCheck(){
    return false;
}
public void fertalizeRow(){

}
    public boolean beenFertalizedCheck(){
        return false;
    }
public void harvestRow(){

}
    public boolean beenHarvesedCheck(){
        return false;
    }


    public boolean isEmpty() {
    return true;
    }
}
