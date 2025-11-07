package Examples.Chapter10;

import java.util.stream.Stream;

public class Exercise21 {
    public static void main(String[] args) {
        var spliterator = Stream.generate(() -> "x")
                .spliterator();

        spliterator.tryAdvance(System.out::print);
        var split = spliterator.trySplit();
        split.tryAdvance(System.out::print);
    }
}
