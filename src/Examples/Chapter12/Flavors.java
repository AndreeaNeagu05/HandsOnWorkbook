package Examples.Chapter12;

import java.util.stream.LongStream;

public class Flavors {
    private static int counter;

    public static void countIceCreamFlavors() {
        counter = 0;
        Runnable task = () -> counter++;
        LongStream.range(0, 500)
                .forEach(m -> Thread.ofPlatform()
                        .priority(1)
                        .unstarted(task)
                        .run());
    }

    public static void main(String[] args) {
        countIceCreamFlavors();
        System.out.println(counter);
    }
}
