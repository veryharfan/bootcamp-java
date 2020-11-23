package co.g2academy.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream(
                    "testout.out");
            fout.write(65);
            fout.write("30".getBytes());
            String stringOut = "This is my first code to write file";
            fout.write(stringOut.getBytes());
            fout.close();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
            //handy, but not suggested in production code
            e.printStackTrace();
        }
    }
}
