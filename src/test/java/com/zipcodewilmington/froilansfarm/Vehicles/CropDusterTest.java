package com.zipcodewilmington.froilansfarm.Vehicles;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import com.zipcodewilmington.froilansfarm.Rider;
import org.junit.Assert;
import org.junit.Test;


public class CropDusterTest {

    //Abstract Class Methods

    @Test
    public void makeNoise(){
        //Given
        CropDuster cropDuster = new CropDuster();
        String expected = "whoosh";
        //When
        String actual = cropDuster.makeNoise();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addRider(){
        //Given
        CropDuster cropDuster = new CropDuster();
        Pilot rider = new Pilot();
        Boolean expected = true;
        //When
        cropDuster.addRider(rider);
        Boolean actual = cropDuster.hasRider(rider);
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeRider(){
        //Given
        CropDuster cropDuster = new CropDuster();
        Pilot rider = new Pilot();
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
        Pilot pilot = new Pilot();
        Boolean expected = true;
        //When
        cropDuster.addRider(pilot);
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
