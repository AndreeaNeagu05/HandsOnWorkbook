package Examples.Chapter10;

import java.util.stream.Stream;

public class Exercise6 {
    public static void main(String[] args) {
        var s = Stream.generate(() -> "meow");
        //var match = s.allMatch(String::isEmpty); //a - correct
        //var match = s.anyMatch(String::isEmpty); //b - The code hangs
        //var match = s.noneMatch(String::isEmpty); //c - The code hangs
        //var match = s.allMatch(String::isEmpty) && s.anyMatch(String::isEmpty); //d - correct
        var match = s.allMatch(String::isEmpty) && s.noneMatch(String::isEmpty); //e - correct
        System.out.println(match);
    }
}
