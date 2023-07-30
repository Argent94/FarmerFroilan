package com.zipcodewilmington.froilansfarm.Animals;

<<<<<<< HEAD
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



=======
import com.zipcodewilmington.froilansfarm.Edible.Egg;
import com.zipcodewilmington.froilansfarm.Field.Produce;
import com.zipcodewilmington.froilansfarm.Rideable;

public class Horse <Corn> extends Animal implements Rideable {
>>>>>>> bc3623b19f7267a06bd3e573b25a1a6ed3c8f51f

}
