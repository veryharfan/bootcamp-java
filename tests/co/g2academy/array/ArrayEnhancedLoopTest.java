package co.g2academy.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayEnhancedLoopTest {

    private ArrayEnhancedLoop array = new ArrayEnhancedLoop();

    @Test
    public void testSumAllItemsInArrayofInteger() {
        int actual = array.calculateSumOfAllItems();
        assertEquals(30, actual);
    }

    @Test
    public void testMultiplicationAllItemsInArrayOfInteger() {
        int actual = array.calculateMultiplicationOfAllItems();
        assertEquals(2400, actual);
    }

    @Test
    public void testAverageAllItemsInArrayOfInteger() {
        int actual = array.calculateAverageOfAllItems();
        assertEquals(6, actual);
    }
}