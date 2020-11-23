package co.g2academy.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++){
            Runnable worker = new WorkerThread("message " + i);
            executor.execute(worker);
        }
        executor.shutdown();
        //loop forever
        while (!executor.isTerminated()){
        }
        System.out.println("Finish all thread");
    }
}
