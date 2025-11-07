package Examples.Chapter9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercise11 {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3);
        var set = Set.of(1, 2, 3);
        var map = Map.of(1, 2, 3, 4);

        list.forEach(System.out::println); //a - ompile
        set.forEach(System.out::println); //b - compile
        //map.forEach(System.out::println); c - error
        //map.keys().forEach(System.out::println); d - error
        map.keySet().forEach(System.out::println); //e - compile
        map.values().forEach(System.out::println); //f - compile
        //map.valueSet().forEach(System.out::println); g - error
    }
}
