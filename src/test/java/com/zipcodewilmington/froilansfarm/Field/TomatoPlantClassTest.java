package com.zipcodewilmington.froilansfarm.Field;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TomatoPlantClassTest {
    @Before
    public void setUp() {

    }
    @Test
    public void hasYieldCheck(){

        //Given
        TomatoPlant tomato = new TomatoPlant();
        boolean expected = true;
        //When

        tomato.setYield(6);
        boolean actual=tomato.hasYieldCheck();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setYield(){
        //Given
        TomatoPlant tomato=new TomatoPlant();
        int expected=6;
        //When
        tomato.setYield(6);
        int actual=tomato.getYield();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getYieldCheck(){
        //Given
        TomatoPlant tomato = new TomatoPlant();
        int expected = 6;
        //When
        tomato.setYield(6);

        int actual=tomato.getYield();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void yieldTest(){
        //Given
        TomatoPlant tomato=new TomatoPlant();

        boolean expected=true;
        //When
        boolean actualbool=false;
        int actual =tomato.yield();
        if(actual<=6||actual>=1){
            actualbool=true;
        }


        //Then
        Assert.assertEquals(expected,actualbool);
    }

}
