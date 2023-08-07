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
        stable.checkOutHorse();
        Integer actual = stable.getSize();
                //Then
        Assert.assertEquals(expected,actual);

    }
    @Test
    void testCheckInHorse() {

        Stable stable = new Stable();
        Horse horse = new Horse();
        //Horse horse1 = new Horse();
        stable.addAnimal(horse);
        stable.checkOutHorse();
        //When

        stable.checkInHorse();
        Integer expected = 1;

        Integer actual = stable.getSize();
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
    public void testSetRidingHorse () {

        //Given
        Stable stable = new Stable();
        Horse horse = new Horse();
        Horse house1 = new Horse();
        stable.addAnimal(horse);
        stable.addAnimal(house1);
        //When
        stable.setRidingHorse(horse);
        Horse expected = horse;

        Horse actual = stable.getRidingHorse();
        Assert.assertEquals(expected,actual);

    }


    @Test
    public void testGetRiddingHors () {
        //Given
        Stable stable = new Stable();
        Horse horse = new Horse();

        stable.addAnimal(horse);
        //When
        stable.setRidingHorse(horse);
        Horse expected = horse;

        Horse actual = stable.getRidingHorse();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testCheckInstance() {
        //Given
         Stable stable = new Stable();
        Boolean expected  = true;
        //When
        Boolean actual = stable instanceof Shelter;
        //Then
        Assert.assertEquals(expected,actual);
    }


}