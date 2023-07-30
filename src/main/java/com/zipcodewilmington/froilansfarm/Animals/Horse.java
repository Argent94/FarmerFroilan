package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Rideable;

import java.util.HashMap;

public class Horse <Corn> extends Animal implements Rideable {

   private HashMap foodEaten ;
   private boolean hasRider ;
   private boolean beenRidden ;
   private boolean beenFed;
   private String noise;
   final private Integer diet = 3;

   public Horse () {
       this.foodEaten = new HashMap<String,Integer >();
       this.noise = "neigh";
       this.beenRidden = false;
       this.beenFed = false;
   }
    public void setBeenRidden (boolean beenRidden) {
        this.beenRidden = beenRidden;
    }
   public boolean getRidden () {
       return beenRidden;
   }
   public String makeNoise() {
       return this.noise ;
   }

   public void setBeenFed (boolean beenFed) {
       this.beenFed = beenFed;
   }
   public boolean getBeenFed () {
       return this.beenFed;
   }




}
