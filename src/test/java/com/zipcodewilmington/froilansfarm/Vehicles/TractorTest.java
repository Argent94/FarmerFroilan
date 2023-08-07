package com.zipcodewilmington.froilansfarm.Vehicles;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

class TractorTest {

    //Abstract Class Methods

    @Test
    public void makeNoise(){
        //Given
        Tractor tractor = new Tractor();

        String expected = "VROOM VROOM";

        //When
        String actual = tractor.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addRider(){

    }

    @Test
    public void removeRider(){

    }

    @Test
    public void hasRiderCheck(){}

    @Test
    public void tractor(){

    }

    @Test
    public void harvest(){

    }


}
