package com.zipcodewilmington.froilansfarm.Vehicles;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirCraftTest {

    @Test
    public void makeNoise(){
        //Given
        AirCraft airCraft = new AirCraft();
        String expected = " ";
        //When
        String actual = airCraft.makeNoise();
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void addRider(){
        //Given
        AirCraft airCraft = new AirCraft();
        Rider rider = new Rider();
        Boolean expected = true;
        //When
        airCraft.addRider(rider);
        Boolean actual = airCraft.addRider(rider);
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeRider(){
        //Given
        AirCraft airCraft = new AirCraft();
        Rider rider = new Rider();
        Boolean expected = false;
        //When
        airCraft.removeRider(rider);
        Boolean actual = airCraft.removeRider(rider);
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void hasRiderCheck(){

    }

    @Test
    public void fertilze(){
        //Given
        AirCraft airCraft = new AirCraft();
        Boolean expected = true;
        //When
        airCraft.fertilize();
        Boolean actual = airCraft.fertilize();
        //Then
        Assert.assertEquals(expected, actual);
    }




}