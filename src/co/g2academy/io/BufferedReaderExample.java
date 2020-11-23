package co.g2academy.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("Please enter your name");

        String name = "";
        while (!name.equals("stop")) {
            System.out.println("Enter your data: ");
            name = br.readLine();
            System.out.println("Data is: " + name);
        }
        br.close();
        r.close();
    }
}
