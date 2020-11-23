package co.g2academy.exceptionhandling;

import co.g2academy.oop.Salary;

import java.io.FileNotFoundException;

public class AgeValidator {

    public boolean validate(int age) { // no throws keyword
        if (age < 18) {
            // unchecked exception
            throw new ArithmeticException("Age are not valid");
        } else {
            return true;
        }
    }

    public boolean validateGender(String gender) throws FileNotFoundException {
        if (gender.equals("male") || gender.equals("female")) {
            return true;
        } else {
            throw new FileNotFoundException("Gender is not found");
        }
    }
}
