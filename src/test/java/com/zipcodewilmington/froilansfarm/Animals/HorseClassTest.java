package com.zipcodewilmington.froilansfarm.Animals;
import com.zipcodewilmington.froilansfarm.Edible.Corn;
import com.zipcodewilmington.froilansfarm.Edible.Edible;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


public class HorseClassTest {



//    @Test
//    public void testEat() {
//        //Given
//        Horse horse = new Horse();
//        Edible corn = new Corn();
//        //When
//        horse.eat("",2);
//        //Then
//    }

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
        String noise = horse.makeNoise();
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
        String noise = horse.makeNoise();
        boolean actual = noise.equals(expected);
        //Then
        Assert.assertFalse(expected,actual);
    }

    @org.junit.Test
    public void fullCheckTestTrue(){
        // Given
        Horse horse = new Horse();
        Boolean expected = true;

        // When
        horse.eat("corn", 3);
        Boolean actual = horse.fullCheck();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void fullCheckTestFalse(){
        // Given
        Horse horse = new Horse();
        Boolean expected = false;

        // When
        horse.eat("corn", 2);
        Boolean actual = horse.fullCheck();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void emptyBellyTest(){
        // Given
        Horse horse = new Horse();
        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("corn", 0);

        // When
        horse.eat("corn", 3);
        horse.emptyBelly();
        Map<String, Integer> actual = horse.getFoodEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }




}
