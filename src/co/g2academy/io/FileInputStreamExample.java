package co.g2academy.io;

import java.io.FileInputStream;

public class FileInputStreamExample {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("testout.out");
            int inputChar = 0;
            while(inputChar != -1) {
                inputChar = fin.read();
                System.out.print((char) inputChar);
            }
            fin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
