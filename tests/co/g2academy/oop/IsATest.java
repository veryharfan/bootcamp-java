package co.g2academy.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsATest {

    @Test
    public void testMammalIsAnAnimal() {
        Mammal mammal = new Mammal();
        assertTrue(mammal instanceof Animal);
    }

    @Test
    public void testDogIsAMammal() {
        Dog dog = new Dog();
        assertTrue(dog instanceof Mammal);
    }

    @Test
    public void testDogIsAnAnimal() {
        Dog dog = new Dog();
        assertTrue(dog instanceof Animal);
    }

    @Test
    public void testReptileIsAnAnimal() {
        Reptile reptile = new Reptile();
        assertTrue(reptile instanceof Animal);
    }
}