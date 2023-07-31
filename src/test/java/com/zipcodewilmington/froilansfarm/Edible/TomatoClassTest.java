package com.zipcodewilmington.froilansfarm.Edible;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import static org.junit.Assert.*;
public class TomatoClassTest {
    @Test
    public void testEatenPropertyInitializedFalse() {
        Tomato tomato = new Tomato();
        assertFalse(tomato.isEaten(), "The 'eaten' property should be initialized as false.");
    }

    @Test
    public void testSetEatenPropertyTrue() {
        Tomato tomato = new Tomato();
        tomato.setEaten(true);
        assertTrue(tomato.isEaten(), "The 'eaten' property should be set to true.");
    }

    @Test
    public void testEatenPropertyRemainsFalse() {
        Tomato tomato = new Tomato();
        // Don't explicitly set the "eaten" property
        assertFalse(tomato.isEaten(), "The 'eaten' property should remain false if not explicitly set.");
    }

    @Test
    public void testMarkTomatoAsEatenMethod() {
        Tomato tomato = new Tomato();
        tomato.markAsEaten();
        assertTrue(tomato.isEaten(), "The 'markAsEaten' method should change the 'eaten' property to true.");
    }

    @Test
    public void testCannotChangeEatenPropertyBackToFalse() {
        Tomato tomato = new Tomato();
        tomato.setEaten(true);
        // Attempt to change the "eaten" property back to false
        tomato.setEaten(false);
        assertTrue(tomato.isEaten(), "Once the 'eaten' property is set to true, it cannot be changed back to false.");
    }
}







