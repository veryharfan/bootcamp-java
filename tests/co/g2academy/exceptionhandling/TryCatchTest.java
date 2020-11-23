package co.g2academy.exceptionhandling;

import org.junit.Test;

public class TryCatchTest {

    @Test
    public void testArithmeticException() {
        try {
            int data = 50/1;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block always executed");
        }
        System.out.println("rest of the code...");
    }

    @Test
    public void testFinallyWhenItHasDifferentFlow() {
        try {
            int data = 50/0;
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block always executed");
        }
        System.out.println("rest of the code...");
    }

    @Test
    public void name() {
    }
}
