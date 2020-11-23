package co.g2academy.io;

import java.io.FileWriter;

public class FileWriterExample {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("testout.out");
            writer.write("This is code to write string to file");
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
