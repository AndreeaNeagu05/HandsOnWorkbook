package Examples.Chapter12;

import java.util.concurrent.*;

public class Exercise4 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        try (ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor()) { // w1
            service.scheduleWithFixedDelay(() -> {
                System.out.println("Open Zoo");
            }, 0, 1, TimeUnit.MINUTES); // w2
            var result = service.submit(() -> System.out.println("Wake Staff")); // w3
            System.out.println(result.get());
        }
    }
}
