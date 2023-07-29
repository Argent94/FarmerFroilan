package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edible.Corn;
import com.zipcodewilmington.froilansfarm.Edible.Edible;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChickenClassTest {

    @Test????

    public void testEat() {
        //Given
        Chicken chicken = new Chicken();
        Edible corn = new Corn();
        //When
        chicken.eat();
        //Then
        Assert.assertEquals();
    }
    @Test
    public void testGetBeenFed () {
        //Given
        Chicken chicken = new Chicken();
        boolean expected = true;

        //When
        chicken.setBeenFed(true);
        boolean actual = horse.getBeenFed();
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
        boolean actual = horse.getBeenFed();
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

  =
}
