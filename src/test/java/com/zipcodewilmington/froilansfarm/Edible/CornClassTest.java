package com.zipcodewilmington.froilansfarm.Edible;
import org.junit.Test;
import static org.junit.Assert.*;
public class CornClassTest {
    public void testEatenPropertyInitializedFalse() {
        Corn corn = new Corn();
        assertFalse(corn.isEaten(), "The 'eaten' property should be initialized as false.");
    }

    @Test
    public void testSetEatenPropertyTrue() {
        Corn corn = new Corn();
        corn.setEaten(true);
        assertTrue(corn.isEaten(), "The 'eaten' property should be set to true.");
    }

    @Test
    public void testEatenPropertyRemainsFalse() {
        Corn corn = new Corn();
        // Don't explicitly set the "eaten" property
        assertFalse(corn.isEaten(), "The 'eaten' property should remain false if not explicitly set.");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEatenPropertyNonBoolean() {
        Corn corn = new Corn();
        corn.setEaten("Yes");  // Attempt to set "eaten" property with a non-boolean value
    }

    @Test
    public void testMarkCornAsEatenMethod() {
        Corn corn = new Corn();
        corn.markAsEaten();
        assertTrue(corn.isEaten(), "The 'markAsEaten' method should change the 'eaten' property to true.");
    }

    @Test
    public void testCannotChangeEatenPropertyBackToFalse() {
        Corn corn = new Corn();
        corn.setEaten(true);
        // Attempt to change the "eaten" property back to false
        corn.setEaten(false);
        assertTrue(corn.isEaten(), "Once the 'eaten' property is set to true, it cannot be changed back to false.");
    }

    @Test
    public void testMultipleCornInstances() {
        Corn corn1 = new Corn();
        Corn corn2 = new Corn();
        corn1.setEaten(true);
        assertFalse(corn2.isEaten(), "Multiple instances of the Corn class should have their own 'eaten' property.");
    }
}








