package com.zipcodewilmington.froilansfarm.Animals;
import com.zipcodewilmington.froilansfarm.Edible.Corn;
import com.zipcodewilmington.froilansfarm.Edible.Edible;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class HorseClassTest {


<<<<<<< HEAD
//    @Test
//    public void testEat() {
//        //Given
//        Horse horse = new Horse();
//        Edible corn = new Corn();
//        //When
//        horse.eat("",2);
//        //Then
//    }
=======
    @Test
    public void testEat() {
        //Given
        Horse horse = new Horse();
        Edible corn = new Corn();
        //When
        horse.eat("",2);
        //Then
    }

    @Test
    public void testGetBeenRidden () {
        //Given
        Horse horse = new Horse();
        boolean expected = true;

        //When
        horse.setBeenRidden(true);
        boolean actual = horse.getBeenRidden();
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSetBeenRiddenTrue () {
        //Given
        Horse horse = new Horse();
        boolean expected = true;

        //When
        horse.setBeenRidden(true);
        boolean actual = horse.getBeenRidden();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSetBeenRiddenFalse () {
        //Given
        Horse horse = new Horse();
        boolean expected = false;

        //When

        boolean actual = horse.getBeenRidden();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetBeenFed () {
        //Given
        Horse horse = new Horse();
        boolean expected = true;

        //When
        horse.setBeenFed(true);
        boolean actual = horse.getBeenFed();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetBeenFedTrue () {
        //Given
        Horse horse = new Horse();
        boolean expected = true;

        //When
        horse.setBeenFed(true);
        boolean actual = horse.getBeenFed();
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testGetBeenFedFalse() {
        //Given
        Horse horse = new Horse();
        boolean expected = false;

        //When

        boolean actual = horse.getBeenFed();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMakeNoise () {
        //Given
        Horse horse = new Horse();
        String expected = "neigh";

        //When

        String actual = horse.makeNoise();
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testMakeNoise1 () {
        //Given
        Horse horse = new Horse();
        String expected = "";

        //When
        String noise = horse.makeNise();
        boolean actual = noise.equals(expected);
        //Then
        Assert.assertFalse(expected,actual);
    }

    @Test
    public void testGetDiet () {
        //Given
        Horse horse = new Horse();
        String expected = "";

        //When
        String noise = horse.makeNise();
        boolean actual = noise.equals(expected);
        //Then
        Assert.assertFalse(expected,actual);
    }

//Need to make test for fullCheck()






}
