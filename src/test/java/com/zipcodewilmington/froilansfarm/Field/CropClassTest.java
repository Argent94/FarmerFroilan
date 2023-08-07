package com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.Edible.Corn;
import com.zipcodewilmington.froilansfarm.Edible.Edible;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CropClassTest {
    @Test
    public void testCropClass() {
        Crop cropClass = new Crop();

    }

    @Test
    public void yieldEdibleTest () {
        //given
        int expected=4;
        Crop cropClass = new Crop();
        Corn corn = new Corn();
        //then
        cropClass.yield();
        cropClass.setYield(4);
       int actual=cropClass.getYield();
       //then
        assertEquals(actual,expected);
    }
    @Test
    public void hasYieldTest () {
        //Given
        boolean expected=true;
        Crop cropClass = new Crop();
        //when
        cropClass.setYield(8);
        boolean actual=cropClass.hasYieldCheck();
        //then
        assertEquals(actual,expected);
    }
    @Test
    public void  FertilizeCropTest () {
        //Given
        boolean expected=true;
        Crop cropClass = new Crop();
        //when
        cropClass.fertalizeCrop();
        boolean actual=cropClass.beenFertalizedCheck();
        //then
        assertEquals(actual,expected);
    }
    @Test
    public void  beenFertilizeCropTest () {
        //Given
        boolean expected=false;
        Crop cropClass = new Crop();
        //when
        boolean actual=cropClass.beenFertalizedCheck();
        //then

        assertEquals(actual,expected);
    }

    @Test
    public void getYieldTest() {
        //Given
        int expected=8;
        Crop cropClass = new Crop();
        //when
        cropClass.setYield(8);
        int actual = cropClass.getYield();
        //then
        assertEquals(actual,expected);
    }
    @Test
    public void setYieldTest() {

        //Given
        int expected=5;
        Crop cropClass = new Crop();
        //when
        cropClass.setYield(5);
        int actual = cropClass.getYield();
        //then
        assertEquals(actual,expected);

    }






}
