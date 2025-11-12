package Examples.Chapter12;

import java.util.List;

public class Exercise21 {
    public static void main(String[] args) {
        var data = List.of(List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6));
        data.parallelStream() // p1
                .flatMap(s -> s.stream())
                .findFirst() // p2
                .ifPresent(System.out::print);
    }
}
