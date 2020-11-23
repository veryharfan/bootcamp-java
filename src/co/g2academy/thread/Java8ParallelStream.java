package co.g2academy.thread;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Java8ParallelStream {

    public static void main(String[] args) {
        System.out.println("Using sequential stream");
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        IntStream stream = Arrays.stream(data);
        stream.forEach( item -> {
            System.out.println(item + " is processed by "
                + Thread.currentThread().getName());
        });

        System.out.println("Using parallel stream");

        IntStream parallelStream = Arrays.stream(data).parallel();
        parallelStream.forEach(item -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(item + " is processed by "
                + Thread.currentThread().getName());
        });
    }
}
