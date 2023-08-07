package com.zipcodewilmington.froilansfarm.Edible;

public class Corn extends Edible{

    private Boolean eaten;

    public Corn(){
        eaten = false;
    }

    public boolean isEaten() {
        if (eaten == true){
            return true;
        }
        return false;
    }

    public void setEaten(Boolean b) {
        eaten = b;
    }
}
