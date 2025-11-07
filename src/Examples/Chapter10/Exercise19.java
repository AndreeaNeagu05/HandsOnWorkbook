package Examples.Chapter10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise19 {
    public static void main(String[] args) {
        List<Integer> x = IntStream.range(1, 6)
                .mapToObj(i -> i)
                .collect(Collectors.toList());
        x.forEach(System.out::println);

        IntStream.range(1, 6); //a - does nothing
        IntStream.range(1, 6).forEach(System.out::println); //b - correct
        IntStream.range(1, 6)
                .mapToObj(i -> i)
                .forEach(System.out::println); //c - correct response, but not the simplest
    }
}
