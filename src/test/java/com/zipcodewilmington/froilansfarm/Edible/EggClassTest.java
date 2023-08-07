package com.zipcodewilmington.froilansfarm.Edible;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class EggClassTest {
    public void testEatenPropertyInitializedFalse() {
        Egg egg = new Egg();
        assertFalse(egg.isEaten(), "The 'eaten' property should be initialized as false.");
    }

    @Test
    public void testSetEatenPropertyTrue() {
        Egg egg = new Egg();
        egg.setEaten(true);
        assertTrue(egg.isEaten(), "The 'eaten' property should be set to true.");
    }

    @Test
    public void testEatenPropertyRemainsFalse() {
        Egg egg = new Egg();
        // Don't explicitly set the "eaten" property
        assertFalse(egg.isEaten(), "The 'eaten' property should remain false if not explicitly set.");
    }

    @Test
    public void testMarkEggAsEatenMethod() {
        Egg egg = new Egg();
        egg.markAsEaten();
        assertTrue(egg.isEaten(), "The 'markAsEaten' method should change the 'eaten' property to true.");
    }


}

