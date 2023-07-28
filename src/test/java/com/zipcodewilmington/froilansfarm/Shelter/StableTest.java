package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StableTest {
    private List<Horse> horses;

    @Before
    public void setUp() {
        horses = new ArrayList<>();
    }

    @Test
    void addAnimal() {
        //Given
        Stable stable = new Stable();
        Horse horse = new Horse();
        Horse house1 = new Horse();
        stable.addAnimal(horse);
        stable.addAnimal(house1);
        //When
        Integer expected = 2;
        Integer actual = stable.getSize();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSize () {
        Stable stable = new Stable();
        Horse horse = new Horse();
        Horse house1 = new Horse();
        stable.addAnimal(horse);
        stable.addAnimal(house1);
        //When
        Integer expected = 2;
        Integer actual = stable.getSize();
        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    void getHorseList() {

        //Given
        Stable stable = new Stable();
        Horse horse = new Horse();
        Horse house1 = new Horse();
        stable.addAnimal(horse);
        stable.addAnimal(house1);
        //When
        Integer expected = 2;
        ArrayList newList = stable.getHorseList();;
        Integer actual = newList.size();
        // Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    void testCheckOutHorse() {
       //Given
        Horse ridingHorse = null;

        Stable stable = new Stable();
        Horse horse = new Horse();
        Horse house1 = new Horse();
        stable.addAnimal(horse);
        stable.addAnimal(house1);
        //When
        Integer expected = 1;
        Integer actual = stable.checkOutHorse();
        //Then
        Assert.assertEquals(expected,actual);

    }
    @Test
    void testCheckInHorse() {
        Horse ridingHorse = null;

        Stable stable = new Stable();
        Horse horse = new Horse();
        Horse house1 = new Horse();
        stable.addAnimal(horse);
        //When
        Integer expected = 2;
        Integer actual = stable.checkInHorse();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    void clear() {
        //Given
        Stable stable = new Stable();
        Horse horse = new Horse();
        Horse house1 = new Horse();
        stable.addAnimal(horse);
        stable.addAnimal(house1);
        //When
        Integer expected = 0 ;
        stable.clear();
        Integer actual = stable.getSize();
        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testSetRiddingHorse () {
        //Given
        Stable stable = new Stable();
        Horse horse = new Horse();
        Horse house1 = new Horse();
        stable.addAnimal(horse);
        stable.addAnimal(house1);
        //When


    }


    @Test
    public void testGetRiddingHors () {

    }
}