package com.zipcodewilmington.froilansfarm.Edible;

public class Potato {

    private Boolean eaten;

    public Potato(){
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

}
