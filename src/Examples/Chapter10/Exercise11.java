package Examples.Chapter10;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise11 {
    public static void main(String[] args) {
       /* System.out.print(
                Stream.iterate(1, x -> x++)
                        .limit(5).map(x -> x)
                        .collect(Collectors.joining(","))
        ); a - false*/

       /* System.out.print(
                Stream.iterate(1, x -> x++)
                        .limit(5).map(x -> "" + x)
                        .collect(Collectors.joining())
        ); b - false*/

        /* System.out.print(
                Stream.iterate(1, x -> ++x)
                        .limit(5).map(x -> x)
                        .collect(Collectors.joining())
         ); c- false*/

        /* Stream.iterate(1, x -> x++)
                .limit(5).map(x -> x)
                .collect(Collectors.joining())
                .forEach(System.out::print); d - false*/

        System.out.print(
                Stream.iterate(1, x -> x + 1)
                        .limit(5)
                        .map(x -> x.toString())
                        .collect(Collectors.joining(","))
        );
    }
}
