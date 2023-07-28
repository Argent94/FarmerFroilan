package com.zipcodewilmington.froilansfarm.Persons;
import org.junit.Assert;
import org.junit.Test;

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
        Map<Edible, int>


        // When
        person.setName("Alex");
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }


}
