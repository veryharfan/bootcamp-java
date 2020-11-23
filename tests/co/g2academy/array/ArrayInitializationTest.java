package co.g2academy.array;

import co.g2academy.basic.MyDate;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayInitializationTest {

    private ArrayInitialization array = new ArrayInitialization();

    @Test
    public void testNamesInitializations() {
        String[] actual = array.getNames();
        assertNotNull(actual);
        assertEquals(3, actual.length);
        assertEquals("Giorgiana", actual[0]);
    }

    @Test
    public void testSimpleNamesInitialization() {
        String[] actual = array.getSimpleNames();
        assertNotNull(actual);
        assertEquals(3, actual.length);
    }

    @Test
    public void testDatesInitialization() {
        MyDate[] actual = array.getDates();
        assertNotNull(actual);
        assertEquals(3, actual.length);
    }

    @Test
    public void testSimpleDatesInitialization() {
        MyDate[] actual = array.getSimpleDates();
        assertNotNull(actual);
        assertEquals(3, actual.length);
    }
}