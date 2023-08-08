package com.zipcodewilmington.froilansfarm.Field;

import java.util.*;

public class CropRow<CropType extends Crop> {
    private List<CropType> cropList;
    CropType produceType;
    boolean harvest  = false;
    boolean fertelize = false;
    private int yieldRow;


    public  CropRow() {
        this.cropList = new ArrayList<>();

    }

    public CropType getProduce() {
        return null;
    }

    public void setProduce(CropType crop) {

    }

    public int setYieldRow(int row) {
        return 0;
    }

    public int getYieldRow() {
        return 0;
    }
//public List<CropType>getCrops() { return null; }

    public boolean beenPlantedCheck() {
        return false;
    }

    public void fertalizeRow() {
        fertelize = true;

    }

    public boolean beenFertalizedCheck() {
        return fertelize;
    }

    public void harvestRow() {

    }


    public boolean beenHarvesedCheck() {
        return harvest;
    }

    public void setHarvest() {
        this.harvest = true;
    }

    public boolean isEmptyCheck() {

       return cropList.isEmpty();
    }
}
