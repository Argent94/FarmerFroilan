package com.zipcodewilmington.froilansfarm.Persons;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
public class PilotClassTest {
    @Test
    public void getNameTest(){
        // Given
        Pilot pilot = new Pilot();
        String expected = "";

        // When
        String actual = pilot.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        // Given
        Pilot pilot = new Pilot();
        String expected = "Old MacDonald";


        // When
        pilot.setName("Old MacDonald");
        String actual = pilot.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatCornTest(){
        // Given
        Pilot pilot = new Pilot();

        // When

        // Then


    }

    @Test
    public void mountTest(){
        // Given
        Pilot pilot = new Pilot();
        Boolean expected = true;

        // When
        pilot.mount();
        Boolean actual = pilot.isRidingCheck();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismountTest(){
        // Given
        Pilot pilot = new Pilot();
        Boolean expected = false;

        // When
        pilot.mount();
        Boolean actual = pilot.isRidingCheck();
        Assert.assertTrue(actual);

        pilot.dismount();
        actual = pilot.isRidingCheck();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeNoiseTest(){
        // Given
        Pilot pilot = new Pilot();
        String expected = "Hello";

        // When
        String actual = pilot.makeNoise();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFoodEatenTest(){
        // Given
        Pilot pilot = new Pilot();
        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("corn", 3);
        expected.put("tomato", 4);
        expected.put("egg", 2);

        // When
        pilot.eat("corn", 3);
        pilot.eat("tomato", 4);
        pilot.eat("egg", 2);
        Map<String, Integer> actual = pilot.getFoodEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBeenFedTest(){
        // Given
        Pilot pilot = new Pilot();
        Boolean expected = false;

        // When
        Boolean actual = pilot.getBeenFed();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBeenFedTest(){
        // Given
        Pilot pilot = new Pilot();
        Boolean expected = true;

        // When
        pilot.setBeenFed(true);
        Boolean actual = pilot.getBeenFed();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getIsRidingTest(){
        // Given
        Pilot pilot = new Pilot();
        Boolean expected = false;

        // When
        Boolean actual = pilot.getIsRiding();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIsRidingTest(){
        // Given
        Pilot pilot = new Pilot();
        Boolean expected = true;

        // When
        pilot.setIsRiding(true);
        Boolean actual = pilot.getIsRiding();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void fullCheckTestTrue(){
        // Given
        Pilot pilot = new Pilot();
        Boolean expected = true;


        // When
        pilot.eat("corn", 3);
        pilot.eat("tomato", 4);
        pilot.eat("egg", 7);
        Boolean actual = pilot.fullCheck();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fullCheckTestFalse(){
        // Given
        Pilot pilot = new Pilot();
        Boolean expected = false;

        // When
        pilot.eat("corn", 3);
        pilot.eat("egg", 1);
        Boolean actual = pilot.fullCheck();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void personIsInstanceOfAnimalTest(){
        // Given
        Pilot pilot = new Pilot();
        Boolean expected = true;

        // When
        Boolean actual = pilot instanceof Person;

        // Then
        Assert.assertEquals(expected, actual);

    }
}
