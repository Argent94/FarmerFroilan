package com.zipcodewilmington.froilansfarm.Persons;
import com.zipcodewilmington.froilansfarm.Edible.Edible;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
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
        Map<Edible, Integer> expected = ;;

        // When
        foodEaten = person.getFoodEaten();


        // Then
        Assert.assertEquals(expected, actual);
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
        Map<Edible, Integer> expected = new HashMap<Edible, Integer>();
        expected.put(Corn, 3);

        // When
        person.eat(3, Corn);

        // Then

    }

    @Test
    public void beenFedCheckTest(){
        // Given



        // When


        // Then

    }

    @Test
    public void resetBeenFedTest(){
        // Given



        // When


        // Then

    }

}
