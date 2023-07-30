package com.zipcodewilmington.froilansfarm.Field;
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
        Crop crop = new Crop();//add tomato
        cropRowClass.setProduce(crop);
        //When
        String expected = "tomato";
        cropRowClass.setProduce(crop);
        Crop actual =cropRowClass.getProduce();
        //Then
        assertEquals(expected,actual);
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

}
