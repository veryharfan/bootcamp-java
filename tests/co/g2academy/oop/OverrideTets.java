package co.g2academy.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class OverrideTets {

    @Test
    public void testMethodMoveOverriding() {
        Animal animal = new Animal();
        String actual = animal.move();
        assertEquals("Animals can move", actual);
    }

    @Test
    public void testMammalsMoveOverring() {
        Animal animal = new Mammal();
        String actual = animal.move();
        assertEquals("Mammals can walk and run", actual);
    }
}