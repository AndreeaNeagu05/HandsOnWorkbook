package Examples.Chapter10;

import java.util.stream.DoubleStream;

public class Exercise17 {
    public static void main(String[] args) {
        var s = DoubleStream.of(1.2, 2.4);
        s.peek(System.out::println).filter(x -> x> 2).count();
    }
}
