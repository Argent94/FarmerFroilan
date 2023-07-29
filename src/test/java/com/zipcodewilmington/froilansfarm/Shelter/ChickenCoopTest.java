package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChickenCoopTest {

    private List<Chicken> chickens;

    @Before
    public void setUp() {
        chickens = new ArrayList<>();
    }

    @Test
    void addAnimal() {
        //Given
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken = new Chicken();
        Chicken chicken1 = new Chicken();
        chickenCoop.addAnimal(chicken);
        chickenCoop.addAnimal(chicken1);
        //When
        Integer expected = 2;
        Integer actual = chicken1.getSize();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSize() {
        //Given
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken = new Chicken();
        Chicken chicken1 = new Chicken();
        chickenCoop.addAnimal(chicken);
        chickenCoop.addAnimal(chicken1);
        //When
        Integer expected = 2;
        Integer actual = chicken1.getSize();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testClear() {
        //Given
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken = new Chicken();
        Chicken chicken1 = new Chicken();
        chickenCoop.addAnimal(chicken);
        chickenCoop.addAnimal(chicken1);
        //When
        Integer expected = 0;
        Integer actual = chicken1.getSize();
        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testCheckInstance() {
        //Given
        ChickenCoop chickenCoop = new ChickenCoop();
        Boolean expected  = true;
        //When
        Boolean actual = chickenCoop instanceof Shelter;
         //Then
        Assert.assertEquals(expected,actual);
    }


}