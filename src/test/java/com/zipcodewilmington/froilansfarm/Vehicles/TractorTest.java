package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class TractorTest {

    //Abstract Class Methods

    @Test
    public void makeNoise(){
        //Given
        Tractor tractor = new Tractor();

        String expected = "VROOM VROOM";

        //When
        String actual = tractor.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addRider(){
        //Given
        Tractor tractor = new Tractor();
        Farmer farmer = new Farmer();
        Boolean expected = false;
        //When
        tractor.add(farmer);
        Boolean actual = tractor.hasRiderCheck(farmer);
        //Then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void removeRider(){
        //Given
        Tractor tractor = new Tractor();
        Farmer farmer = new Farmer();
        Boolean expected = false;
        //When
        tractor.removeRider(farmer);
        Boolean actual = tractor.hasRiderCheck(farmer);
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void hasRiderCheck(){
        //Given
        Tractor tractor = new Tractor();
        boolean expected = true;

        //When
        tractor.setBeenRidden(true);
        boolean actual = tractor.getBeenRidden();
        //Then
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void testInstanceOfVehicle(){
        //Given
        Tractor tractor = new Tractor();
        boolean expected = true;

        //When

        boolean actual = tractor instanceof Vehicle;
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testInstanceOfFarmVehicle(){
        //Given
        Tractor tractor = new Tractor();
        boolean expected = true;

        //When

        boolean actual = tractor instanceof FarmVehicle;
        //Then
        Assert.assertEquals(expected,actual);
    }

}
