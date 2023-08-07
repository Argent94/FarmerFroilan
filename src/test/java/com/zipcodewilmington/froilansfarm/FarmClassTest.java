package com.zipcodewilmington.froilansfarm;
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
        FarmHouse expected = farmHouse;
        // When
        FarmHouse actual = farm.getFarmHouse();
        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testSetFarmHouse(){
        // Given
        FarmHouse farmHouse = new FarmHouse();
        Farm farm = new Farm();
        farm.setFarmHouse(farmHouse);
        FarmHouse expected = farmHouse;
        // When
        FarmHouse actual = farm.getFarmHouse();
        // Then
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void testSetFarm(){
        // Given
        FarmHouse farmHouse = new FarmHouse();
        Farm farm = new Farm();
        farm.setFarmHouse(farmHouse);
        FarmHouse expected = farmHouse;
        // When
        FarmHouse actual = farm.getFarmHouse();
        // Then
        Assert.assertEquals(expected,actual);
    }

//    @Test
//    public void testSetFarm(){
//        // Given
//        Farm farm = new Farm();
//        FarmHouse farmHouse = new FarmHouse();
//        Stock
//
//
//       House expected = farmHouse;
//        // When
//        FarmHouse actual = farm.getFarmHouse();  farm.getStock();
//        // Then
//        Assert.assertEquals(expected,actual);
//    }
//
    @Test
    public void testSetFarm1() {
        // Given
        Farm farm = new Farm();
        FarmHouse farmHouse = new FarmHouse();


        FarmHouse expected = farmHouse;
        // When
        FarmHouse actual = farm.getFarmHouse();
        farm.getStock();
        // Then
        Assert.assertEquals(expected, actual);
    }
}
