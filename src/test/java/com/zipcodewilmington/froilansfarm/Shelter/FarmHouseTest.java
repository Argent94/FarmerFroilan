package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FarmHouseTest {
    private List<Person> house;

    @Before
    public void setUp() {
        house = new ArrayList<>();
    }

    @Test
    void testAddAnimal() {
        //Given
        FarmHouse farmHouse = new FarmHouse();
        Person person = new Person();
        Person person1 = new Person();
        farmHouse.addAnimal(person);
        farmHouse.addAnimal(person1);
        //When
        Integer expected = 2;
        Integer actual = farmHouse.getSize();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testGetSize() {
        //Given
        FarmHouse farmHouse = new FarmHouse();
        Person person = new Person();
        Person person1 = new Person();
        farmHouse.addAnimal(person);
        farmHouse.addAnimal(person1);
        //When
        Integer expected = 2;
        Integer actual = farmHouse.getSize();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAnimal() {
        //Given
        FarmHouse farmHouse = new FarmHouse();
        Person person = new Person();
        Person person1 = new Person();
        farmHouse.addAnimal(person);
        farmHouse.addAnimal(person1);
        //When
        Person expected = person;
        Person actual = farmHouse.getAnimal(person);
        //Than
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetAnimal1() {
        //Given
        FarmHouse farmHouse = new FarmHouse();
        Person person = new Person();
        Person person1 = new Person();
        farmHouse.addAnimal(person);
        farmHouse.addAnimal(person1);
        //When
        Integer expected = 0 ;
        farmHouse.clear();
        Integer actual = farmHouse.getSize();
        //Than
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void testCheckInstance() {
        //Given
        FarmHouse farmHouse = new FarmHouse();
        Boolean expected  = true;
        //When
        Boolean actual = farmHouse instanceof Shelter;
        //Then
        Assert.assertEquals(expected,actual);
    }






}