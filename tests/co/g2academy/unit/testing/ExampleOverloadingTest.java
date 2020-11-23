package co.g2academy.unit.testing;

import co.g2academy.basic.ExampleOverloading;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleOverloadingTest {

    @Test
    public void testMinFunctionInteger() {
        int actual = ExampleOverloading.minFunction(11, 6);
        assertEquals(6, actual);
    }

    @Test
    public void testMinFunctionDouble() {
        double actual = ExampleOverloading.minFunction(7.3, 9.4);
        assertEquals(Double.valueOf(7.3), Double.valueOf(actual));
    }
}