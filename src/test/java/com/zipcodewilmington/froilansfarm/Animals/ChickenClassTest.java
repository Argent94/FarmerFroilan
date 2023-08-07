package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edible.Corn;
import com.zipcodewilmington.froilansfarm.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ChickenClassTest {

    @Test

    public void testEat() {
        //Given
        Chicken chicken = new Chicken();
        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("corn", 3);

        // When
        chicken.eat("corn", 3);
        Map<String, Integer> actual = chicken.getFoodEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetBeenFed () {
        //Given
        Chicken chicken = new Chicken();
        boolean expected = true;

        //When
        chicken.setBeenFed(true);
        boolean actual = chicken.getBeenFed();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetBeenFedTrue () {
        //Given
        Chicken chicken = new Chicken();
        boolean expected = true;

        //When
        chicken.setBeenFed(true);
        boolean actual = chicken.getBeenFed();
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testGetBeenFedFalse() {
        //Given
        Chicken chicken = new Chicken();
        boolean expected = false;

        //When

        boolean actual = chicken.getBeenFed();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMakeNoise () {
        //Given
        Chicken chicken = new Chicken();
        String expected = "cluck";

        //When

        String actual = chicken.makeNoise();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void fullCheckTestTrue(){
        // Given
        Chicken chicken = new Chicken();
        Boolean expected = true;

        // When
        chicken.eat("corn", 1);
        Boolean actual = chicken.fullCheck();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void emptyBellyTest(){
        // Given
        Chicken chicken = new Chicken();
        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("corn", 0);

        // When
        chicken.eat("corn", 3);
        chicken.emptyBelly();
        Map<String, Integer> actual = chicken.getFoodEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void fullCheckTestFalse(){
        // Given
        Chicken chicken = new Chicken();
        Boolean expected = false;

        // When
        Boolean actual = chicken.fullCheck();

        // Then
        Assert.assertEquals(expected, actual);
    }


}
