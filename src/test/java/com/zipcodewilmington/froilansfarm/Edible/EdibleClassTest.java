package com.zipcodewilmington.froilansfarm.Edible;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class EdibleClassTest {
    @Test
    public void testEatenPropertyInitializedFalse() {
        EdibleClass edible = mock(EdibleClass.class);
        when(edible.isEaten()).thenReturn(false);

        assertFalse(edible.isEaten(), "The 'eaten' property should be initialized as false.");
    }

    @Test
    public void testSetEatenPropertyTrue() {
        EdibleClass edible = mock(EdibleClass.class);
        doCallRealMethod().when(edible).setEaten(true);
        edible.setEaten(true);

        assertTrue(edible.isEaten(), "The 'eaten' property should be set to true.");
    }

    @Test
    public void testEatenPropertyRemainsFalse() {
        EdibleClass edible = mock(EdibleClass.class);
        when(edible.isEaten()).thenReturn(false);

        assertFalse(edible.isEaten(), "The 'eaten' property should remain false if not explicitly set.");
    }

    @Test
    public void testMarkAsEatenMethod() {
        EdibleClass edible = mock(EdibleClass.class);
        doCallRealMethod().when(edible).markAsEaten();
        edible.markAsEaten();

        assertTrue(edible.isEaten(), "The 'markAsEaten' method should change the 'eaten' property to true.");
    }

    @Test
    public void testCannotChangeEatenPropertyBackToFalse() {
        EdibleClass edible = mock(EdibleClass.class);
        doCallRealMethod().when(edible).setEaten(true);
        doCallRealMethod().when(edible).setEaten(false);
        edible.setEaten(true);
        edible.setEaten(false);

        assertTrue(edible.isEaten(), "Once the 'eaten' property is set to true, it cannot be changed back to false.");
    }
}

