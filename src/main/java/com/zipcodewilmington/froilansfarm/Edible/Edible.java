package com.zipcodewilmington.froilansfarm.Edible;

public abstract class Edible {

    private Boolean eaten;

    public boolean isEaten() {
        if (eaten == true){
            return true;
        }
        return false;
    }

}
