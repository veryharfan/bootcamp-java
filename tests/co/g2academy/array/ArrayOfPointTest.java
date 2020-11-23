package co.g2academy.array;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class ArrayOfPointTest {

    @Test
    public void createArrayTest() {
        ArrayOfPoint arrayOfPoint = new ArrayOfPoint();
        Point[] actual = arrayOfPoint.createPoint();
        assertNotNull(arrayOfPoint);
        assertEquals(10, actual.length);
        assertEquals(new Point(0,1), actual[0]);
        assertEquals(new Point(9, 10), actual[9]);
    }
}