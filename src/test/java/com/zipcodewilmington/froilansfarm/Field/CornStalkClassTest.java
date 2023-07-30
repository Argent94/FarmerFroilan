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
        boolean actual=cornStalk.hasYieldCheck(20);
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
        int actual=cornStalk.getYield();
        //Then
        Assert.assertEquals(expected,actual);

    }




}
