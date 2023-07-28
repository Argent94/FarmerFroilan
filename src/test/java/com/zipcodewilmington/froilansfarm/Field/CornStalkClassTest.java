package com.zipcodewilmington.froilansfarm.Field;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;
public class CornStalkClassTest {
    @Before
    public void setUp() {

    }
    @Test
    public void yeildCheck(){
        //Given
        CornStalk cornStalk=new CornStalk();
        boolean expected=true;
        //When
        boolean actual=cornStalk.hasYieldCheck(6);
        //Then
        Assert.assertEquals(expected,actual);
    }



}
