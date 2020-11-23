package co.g2academy.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class SalaryTest {

    @Test
    public void testPolymorphismInMethod() {
        Employee employee = new Employee("ifnu", "depok", 123);
        String actual = employee.mailCheck();
        assertEquals("Mailing a check to ifnu depok", actual);

        Employee salary = new Salary("ifnu","depok", 123, 5200);
        actual = salary.mailCheck();
        assertEquals("Within mailcheck of Salary class Mailing a check to ifnu depok", actual);
    }

    @Test
    public void testAvoidSettingSalaryToNegativeNumber() {
        Salary salary = new Salary("ifnu", "depok", 123,5200);
        salary.setSalary(-1);
        double actual = salary.getSalary();
        assertEquals(Double.valueOf(5200), Double.valueOf(actual));
    }
}