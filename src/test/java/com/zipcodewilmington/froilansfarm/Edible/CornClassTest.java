package com.zipcodewilmington.froilansfarm.Edible;
import org.junit.Test;
import static org.junit.Assert.*;
public class CornClassTest {
    public void testEatenPropertyInitializedFalse() {
        Corn corn = new Corn();
        assertFalse("The 'eaten' property should be initialized as false.", corn.isEaten());
    }

    @Test
    public void testSetEatenPropertyTrue() {
        Corn corn = new Corn();
        corn.setEaten(true);
        assertTrue("The 'eaten' property should be set to true.", corn.isEaten());
    }

    @Test
    public void testEatenPropertyRemainsFalse() {
        Corn corn = new Corn();
        // Don't explicitly set the "eaten" property
        assertFalse("The 'eaten' property should remain false if not explicitly set.", corn.isEaten());
    }

    // What is this test doing?
    /*
    @Test(expected = IllegalArgumentException.class)
    public void testSetEatenPropertyNonBoolean() {
        Corn corn = new Corn();
        corn.setEaten("Yes");  // Attempt to set "eaten" property with a non-boolean value
    }
     */

    @Test
    public void testCannotChangeEatenPropertyBackToFalse() {
        Corn corn = new Corn();
        corn.setEaten(true);
        // Attempt to change the "eaten" property back to false
        corn.setEaten(false);
        assertTrue("Once the 'eaten' property is set to true, it cannot be changed back to false.", corn.isEaten());
    }

    @Test
    public void testMultipleCornInstances() {
        Corn corn1 = new Corn();
        Corn corn2 = new Corn();
        corn1.setEaten(true);
        assertFalse("Multiple instances of the Corn class should have their own 'eaten' property.", corn2.isEaten());
    }
}








