package com.zipcodewilmington.froilansfarm.Field;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CornStalkClassTest {
    @Before
    public void setUp() {

    }
    @Test
    public void hasYieldCheck(){

        //Given
        CornStalk cornStalk=new CornStalk();
        boolean expected=true;
        //When
        cornStalk.setYield(6);
        boolean actual=cornStalk.hasYieldCheck();
        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setYield(){
        //Given
        CornStalk cornStalk=new CornStalk();
        int expected=6;
        //When
        cornStalk.setYield(6);
        int actual=cornStalk.getYield();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getYieldCheck(){
        //Given
        CornStalk cornStalk=new CornStalk();
        int expected=6;
        //When
        cornStalk.setYield(6);
        int actual=cornStalk.getYield();
        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void yieldTest(){
        //Given
        CornStalk corn=new CornStalk();

        boolean expected=true;
        //When
        boolean actualbool=false;
        int actual =corn.yield();
        if(actual<=6||actual>=1){
            actualbool=true;
        }


        //Then
        Assert.assertEquals(expected,actualbool);
    }


}
