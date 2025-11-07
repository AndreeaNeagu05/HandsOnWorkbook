package Examples.Chapter10;

import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Exercise5 {
    public static void main(String[] args) {
       /* double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x)); a - error */

        /* double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x)); b - error, replace mapToInt with map */

        double result1 = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x)); //c - correct

        /* double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x)); d - error */

        /* double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x)); e - error, replace mapToInt with map */

        double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x)); //f - correct

        System.out.println("c: " + result1 + ", " + "f: " + result);
    }
}
