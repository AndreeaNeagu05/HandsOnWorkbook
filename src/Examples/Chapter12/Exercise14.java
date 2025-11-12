package Examples.Chapter12;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Exercise14 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        try (var service = Executors.newFixedThreadPool(2)) {
            var f1 = service.submit(() -> {
                synchronized (o1) {
                    synchronized (o2) {
                        System.out.print("Tortoise");
                    }
                }
            });
            var f2 = service.submit(() -> {
                synchronized (o2) {
                    synchronized (o1) {
                        System.out.print("Hare");
                    }
                }
            });
            f1.get();
            f2.get();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
