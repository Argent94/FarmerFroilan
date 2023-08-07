package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Edible.Corn;
import com.zipcodewilmington.froilansfarm.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Edible.Potato;
import com.zipcodewilmington.froilansfarm.Edible.Tomato;
import com.zipcodewilmington.froilansfarm.Edible.Egg;
import com.zipcodewilmington.froilansfarm.Field.Field;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Shelter.FarmHouse;
import com.zipcodewilmington.froilansfarm.Shelter.Stable;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Farm<EdibleType extends Edible, PersonType extends Person>{

    private Field field;
    private FarmHouse house;
    private List<Stable> stables;
    private List<ChickenCoop> coops;
    private Tractor tractor;
    private CropDuster cropDuster;
    private HashMap<String, List<EdibleType>> stock;

    public Farm(){
        field = new Field();
        house = new FarmHouse();
        stables = new ArrayList<>();
        coops = new ArrayList<>();
        tractor = new Tractor();
        cropDuster = new CropDuster();
        stock = new HashMap<>();

        stock.put("corn", new ArrayList<>());
        stock.put("tomato", new ArrayList<>());
        stock.put("potato", new ArrayList<>());
        stock.put("egg", new ArrayList<>());
    }


    public FarmHouse getFarmHouse(){
        return house;
    }

    public void setFarmHouse(FarmHouse farmHouse){
        house = farmHouse;
    }

    public HashMap<String, List<EdibleType>> getStock(){
        return stock;
    }

    public void updateCropStock(String food, Integer num){
        List tempList = stock.get(food);
        if (food.equals("corn")) {
            for (int i = 0; i < num; i++) {
                tempList.add(new Corn());
            }
        } else if (food.equals("tomato")) {
            for (int i = 0; i < num; i++) {
                tempList.add(new Tomato());
            }
        } else if (food.equals("potato")) {
            for (int i = 0; i < num; i++) {
                tempList.add(new Potato());
            }
        }  else if (food.equals("egg")) {
            for (int i = 0; i < num; i++) {
                tempList.add(new Egg());
            }
        }

        stock.put(food, tempList);
    }

    public void rideHorses(){
        ArrayList tempList = new ArrayList<Horse>();
        for (int i = 0; i < stables.size(); i++){
            tempList = stables.get(i).getHorseList();
            for (int j = 0; j < tempList.size(); j++){

            }
        }
    }


   /* - cropRows: CropRow [ 5 ]
            - plantedRows: int
    + Field()
+ getPlantedRows(): int
+ setPlantedRows(int)
+ firstAvailableRow(CropRow[]): int
+ fillCropRow(int, Crop)
+ isRowAvailable(int, CropRow[]): boolean
+ doesFieldContain(CropRow[], CropType): boolean
+ plantRow(CropType)
+ fertalizeField()
+ harvestField()*/
}
