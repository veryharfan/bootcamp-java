package co.g2academy.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayResizingTest {

    @Test
    public void testArrayResizing() {
        int[] initialArray = {10,20,30};
        ArrayResizing array = new ArrayResizing();
        int[] actual = array.resize(initialArray, 5);
        assertNotNull(actual);
        assertEquals(5, actual.length);
        assertEquals(10, actual[0]);
        assertEquals(20, actual[1]);
        assertEquals(30, actual[2]);
    }




}