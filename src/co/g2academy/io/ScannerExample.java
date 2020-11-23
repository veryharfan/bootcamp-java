package co.g2academy.io;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (!name.equals("stop")) {
            System.out.println("Input data here: ");
            name = scanner.nextLine();
            System.out.println("Data is: " + name);
        }
        scanner.close();
    }
}
