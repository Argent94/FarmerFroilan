package com.zipcodewilmington.froilansfarm.Edible;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class PotatoClassTest {
    @Test
    public void testEatenPropertyInitializedFalse() {
        Potato potato = new Potato();
        assertFalse(potato.isEaten(), "The 'eaten' property should be initialized as false.");
    }

    @Test
    public void testSetEatenPropertyTrue() {
        Potato potato = new Potato();
        potato.setEaten(true);
        assertTrue(potato.isEaten(), "The 'eaten' property should be set to true.");
    }

    @Test
    public void testEatenPropertyRemainsFalse() {
        Potato potato = new Potato();
        // Don't explicitly set the "eaten" property
        assertFalse(potato.isEaten(), "The 'eaten' property should remain false if not explicitly set.");
    }


}

