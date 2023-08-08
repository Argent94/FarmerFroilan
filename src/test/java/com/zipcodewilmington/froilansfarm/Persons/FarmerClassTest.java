package com.zipcodewilmington.froilansfarm.Persons;
import com.zipcodewilmington.froilansfarm.Animals.Animal;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
public class FarmerClassTest {

    @Test
    public void getNameTest(){
        // Given
        Farmer farmer = new Farmer();
        String expected = "";

        // When
        String actual = farmer.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        // Given
        Farmer farmer = new Farmer();
        String expected = "Old MacDonald";


        // When
        farmer.setName("Old MacDonald");
        String actual = farmer.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatCornTest(){
        // Given
        Farmer farmer = new Farmer();

        // When

        // Then


    }

    @Test
    public void mountTest(){
        // Given
        Farmer farmer = new Farmer();
        Boolean expected = true;

        // When
        farmer.mount();
        Boolean actual = farmer.isRidingCheck();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismountTest(){
        // Given
        Farmer farmer = new Farmer();
        Boolean expected = false;

        // When
        farmer.mount();
        Boolean actual = farmer.isRidingCheck();
        Assert.assertTrue(actual);

        farmer.dismount();
        actual = farmer.isRidingCheck();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeNoiseTest(){
        // Given
        Farmer farmer = new Farmer();
        String expected = "Hello";

        // When
        String actual = farmer.makeNoise();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFoodEatenTest(){
        // Given
        Farmer farmer = new Farmer();
        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("corn", 3);
        expected.put("tomato", 4);
        expected.put("egg", 2);

        // When
        farmer.eat("corn", 3);
        farmer.eat("tomato", 4);
        farmer.eat("egg", 2);
        Map<String, Integer> actual = farmer.getFoodEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBeenFedTest(){
        // Given
        Farmer farmer = new Farmer();
        Boolean expected = false;

        // When
        Boolean actual = farmer.getBeenFed();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBeenFedTest(){
        // Given
        Farmer farmer = new Farmer();
        Boolean expected = true;

        // When
        farmer.setBeenFed(true);
        Boolean actual = farmer.getBeenFed();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getIsRidingTest(){
        // Given
        Farmer farmer = new Farmer();
        Boolean expected = false;

        // When
        Boolean actual = farmer.getIsRiding();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIsRidingTest(){
        // Given
        Farmer farmer = new Farmer();
        Boolean expected = true;

        // When
        farmer.setIsRiding(true);
        Boolean actual = farmer.getIsRiding();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void fullCheckTestTrue(){
        // Given
        Farmer farmer = new Farmer();
        Boolean expected = true;


        // When
        farmer.eat("corn", 3);
        farmer.eat("tomato", 4);
        farmer.eat("egg", 7);
        Boolean actual = farmer.fullCheck();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fullCheckTestFalse(){
        // Given
        Farmer farmer = new Farmer();
        Boolean expected = false;

        // When
        farmer.eat("corn", 3);
        farmer.eat("egg", 1);
        Boolean actual = farmer.fullCheck();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void emptyBellyTest(){
        // Given
        Farmer farmer = new Farmer();
        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("corn", 0);
        expected.put("tomato", 0);
        expected.put("egg", 0);

        // When
        farmer.eat("corn", 3);
        farmer.eat("tomato", 4);
        farmer.emptyBelly();
        Map<String, Integer> actual = farmer.getFoodEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void farmerIsInstanceOfPersonTest(){
        // Given
        Farmer farmer = new Farmer();
        Boolean expected = true;

        // When
        Boolean actual = farmer instanceof Person;

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void farmerIsInstanceOfAnimalTest(){
        // Given
        Farmer farmer = new Farmer();
        Boolean expected = true;

        // When
        Boolean actual = farmer instanceof Animal;

        // Then
        Assert.assertEquals(expected, actual);

    }

}
