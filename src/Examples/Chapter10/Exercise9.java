package Examples.Chapter10;

import java.util.stream.LongStream;

public class Exercise9 {
    public static void main(String[] args) {
        var stream = LongStream.of(1, 2, 3);
        var opt = stream.map(n -> n * 10)
                .filter(n -> n < 5).findFirst();

        /* if (opt.isPresent())
            System.out.println(opt.get()); a - Cannot resolve method 'get' in 'OptionalLong'*/

        if (opt.isPresent())
            System.out.println(opt.getAsLong()); // b - correct

       // opt.ifPresent(System.out.println); c - error, Cannot resolve symbol 'println'

        opt.ifPresent(System.out::println); // d - correct
    }
}
