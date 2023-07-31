package com.zipcodewilmington.froilansfarm.Vehicles;
import com.zipcodewilmington.froilansfarm.Rider;
import org.junit.Assert;
import org.junit.Test;


public class CropDusterTest {

    //Abstract Class Methods

    @Test
    public void makeNoise(){
        //Given
        CropDuster cropDuster = new CropDuster();
        String expected = "TWEET TWEET";
        //When
        String actual = cropDuster.makeNoise();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addRider(){
        //Given
        CropDuster cropDuster = new CropDuster();
        Rider rider = new Rider();
        Boolean expected = true;
        //When
        cropDuster.addRider(rider);
        Boolean actual = cropDuster.addRider(rider);
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeRider(){
        //Given
        CropDuster cropDuster = new CropDuster();
        Rider rider = new Rider();
        Boolean expected = false;
        //When
        cropDuster.removeRider(rider);
        Boolean actual = cropDuster.removeRider(rider);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hasRiderCheck(){
        //Given
        CropDuster cropDuster = new CropDuster();
        Rider rider = new Rider();
        Boolean expected = true;
        //When
        cropDuster.addRider();
        Boolean actual = cropDuster.hasRider();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fertilize(){
        //Given
        CropDuster cropDuster = new CropDuster();
        Boolean expected = true;
        //When
        Boolean actual = cropDuster.fertilize();
        //Then
        Assert.assertEquals(expected, actual);

    }


}
