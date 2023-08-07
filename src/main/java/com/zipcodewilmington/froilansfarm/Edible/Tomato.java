package com.zipcodewilmington.froilansfarm.Edible;

public class Tomato {

    private Boolean eaten;

    public Tomato(){
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
