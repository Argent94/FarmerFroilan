package com.zipcodewilmington.froilansfarm.Persons;
import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Edible.Edible;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

//import static org.junit.jupiter.api.Assertions.*;
public class PersonClassTest {

    @Test
    public void getNameTest(){
        // Given
        Person person = new Person();
        String expected = "";

        // When
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        // Given
        Person person = new Person();
        String expected = "Alex";


        // When
        person.setName("Alex");
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatCornTest(){
        // Given
        Person person = new Person();

        // When

        // Then


    }

    @Test
    public void mountTest(){
        // Given
        Person person = new Person();
        Boolean expected = true;

        // When
        person.mount();
        Boolean actual = person.isRidingCheck();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismountTest(){
        // Given
        Person person = new Person();
        Boolean expected = false;

        // When
        person.mount();
        Boolean actual = person.isRidingCheck();
        Assert.assertTrue(actual);

        person.dismount();
        actual = person.isRidingCheck();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeNoiseTest(){
        // Given
        Person person = new Person();
        String expected = "Hello";

        // When
        String actual = person.makeNoise();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFoodEatenTest(){
        // Given
        Person person = new Person();
        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("Corn", 3);

        // When
        person.eat("Corn", 3);
        Map<String, Integer> actual = person.getFoodEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBeenFedTest(){
        // Given
        Person person = new Person();
        Boolean expected = false;

        // When
        Boolean actual = person.getBeenFed();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBeenFedTest(){
        // Given
        Person person = new Person();
        Boolean expected = true;

        // When
        person.setBeenFed(true);
        Boolean actual = person.getBeenFed();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getIsRidingTest(){
        // Given
        Person person = new Person();
        Boolean expected = false;

        // When
        Boolean actual = person.getIsRiding();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIsRidingTest(){
        // Given
        Person person = new Person();
        Boolean expected = true;

        // When
        person.setIsRiding(true);
        Boolean actual = person.getIsRiding();

        // Then
        Assert.assertEquals(expected, actual);

    }



    @Test
    public void personIsInstanceOfAnimalTest(){
        // Given
        Person person = new Person();
        Boolean expected = true;

        // When
        Boolean actual = person instanceof Animal;

        // Then
        Assert.assertEquals(expected, actual);

    }

}
