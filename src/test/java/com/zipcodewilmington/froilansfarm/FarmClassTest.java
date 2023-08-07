package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Shelter.FarmHouse;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FarmClassTest {

    @Test
    public void testGetFarmHouse(){
        // Given
        FarmHouse farmHouse = new FarmHouse();
        Farm farm = new Farm();

        farm.setFarmHouse(farmHouse);
        FarmHouse expected = farm.getFarmHouse();
        // When
        FarmHouse actual = farm.getFarmHouse();
        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testSetFarmHouse(){
        // Given
        Farm farm = new Farm();
        FarmHouse farmHouse = new FarmHouse();
        farm.setFarmHouse(farmHouse);

        FarmHouse expected = farmHouse;
        // When
        FarmHouse actual = farm.getFarmHouse();
        // Then
        Assert.assertEquals(expected,actual);
    }















}
