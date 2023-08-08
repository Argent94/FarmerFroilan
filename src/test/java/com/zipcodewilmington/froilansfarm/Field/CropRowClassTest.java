package com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.Edible.Tomato;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CropRowClassTest {
    @Test
    public void testCropRowClass() {
        //Given
        CropRow cropRowClass = new CropRow();
        //When
        cropRowClass.getClass();
        //Then

    }
    @Test
    public void getProduceTest() {
        //Given
        CropRow cropRowClass = new CropRow();
        //When

        //Then
    }
    @Test
    public void setProduceTest() {
        //Given
        CropRow cropRowClass = new CropRow();
        TomatoPlant crop = new TomatoPlant();//add tomato
        //When

        cropRowClass.setProduce(crop);
        Crop actual =cropRowClass.getProduce();
        //Then
        assertTrue(actual instanceof TomatoPlant);
    }
    @Test
    public void setYieldRowTest() {
        //Given
        CropRow cropRowClass = new CropRow();
        //When

        //Then
    }

    @Test
    public void getYieldRowTest() {
        //Given
        CropRow cropRowClass = new CropRow();
        //When

        //Then
    }
    @Test
    public void beenPlantedTest() {
        //Given
        CropRow cropRowClass = new CropRow();
        //When

        //Then

    }
    @Test
    public void fertalizeRowTest() {
        //Given
        CropRow cropRowClass = new CropRow();
        boolean expected=true;
        //When
        cropRowClass.fertalizeRow();
       boolean actual= cropRowClass.beenFertalizedCheck();
        //Then
        assertEquals(actual,expected);
    }
    @Test
    public void beenfertalizeRowTest() {
        //Given
        CropRow cropRowClass = new CropRow();
        boolean expected=false;
        //When
        boolean actual= cropRowClass.beenFertalizedCheck();
        //Then
        assertEquals(actual,expected);
    }
    @Test
    public void harvestRowTest() {
        //Given
        CropRow cropRowClass = new CropRow();
        boolean expected=false;
        //When
        cropRowClass.harvestRow();
        boolean actual= cropRowClass.beenFertalizedCheck();
        //Then
        assertEquals(actual,expected);
    }
    @Test
    public void beenHarvestedTest() {
        //Given
        CropRow cropRowClass = new CropRow();
        boolean expected=false;
        //When
        boolean actual= cropRowClass.beenHarvesedCheck();
        //Then
        assertEquals(actual,expected);
    }
    @Test
    public void isEmptyTest() {
        //Given
        CropRow cropRowClass = new CropRow();
        boolean expected=true;
        //When
        boolean actual= cropRowClass.isEmpty();
        //Then
        assertEquals(actual,expected);
    }



}
