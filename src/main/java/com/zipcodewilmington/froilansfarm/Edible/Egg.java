package com.zipcodewilmington.froilansfarm.Edible;

public class Egg extends Edible{

    private Boolean eaten;

    public Egg(){
        eaten = false;
    }
    public boolean isEaten() {
        if (eaten == true){
            return true;
        }
        return false;
    }

    public void setEaten(boolean b) {
        eaten = b;
    }

    public void markAsEaten() {
        eaten = true;
    }
}
