package Examples.Chapter12;

import java.util.List;

public class Exercise6 {
    public static void main(String[] args) {
        var data = List.of(2, 5, 1, 9, 8);
        data.stream().parallel()
                .mapToInt(s -> s)
                .peek(System.out::print)
                .forEachOrdered(System.out::print);
    }
}
