package Examples.Chapter12;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exercise12 {
    public static void main(String[] args) throws InterruptedException {
        new Exercise12().shutdown();
        new Exercise12().shutdown();
    }

    private void takeNap() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void shutdown() throws InterruptedException {
        var service = Executors.newFixedThreadPool(4);
        try {
            service.execute(() -> takeNap());
            service.execute(() -> takeNap());
            service.execute(() -> takeNap());
        } finally {
            service.shutdown();
        }
        service.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("DONE!");
    }
    public void refactored() {
        try (var service = Executors.newFixedThreadPool(4)) {
            service.execute(() -> takeNap());
            service.execute(() -> takeNap());
            service.execute(() -> takeNap());
        }
        System.out.println("DONE!");
    }
}
