package Examples.Chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
    private static List<String> sort(List<String> list) {
        var copy = new ArrayList<String>(list);
        Collections.sort(copy, (a, b) -> b.compareTo(a));
        return copy;
    }

    private static List<String> refactored(List<String> list) {
        /* return list.stream()
                .compare((a, b) -> b.compareTo(a))
                .toList(); a - error, Cannot resolve method 'compare' in 'Stream' */

         /* return list.stream()
                .compare((a, b) -> b.compareTo(a))
                .sort(); b - error, Cannot resolve method 'compare' in 'Stream' */

         /* return list.stream()
                .compareTo((a, b) -> b.compareTo(a))
                .toList(); c - error, Cannot resolve method 'compareTo' in 'Stream' */

        /* return list.stream()
                .compareTo((a, b) -> b.compareTo(a))
                .sort(); d - error, Cannot resolve method 'compareTo' in 'Stream' */

         /*return list.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(); e - error, Cannot resolve method 'collect()'*/

         return list.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList()); // f - correct
    }

    public static void main(String[] args) {
        System.out.println(refactored(List.of("1", "3", "2")));
        System.out.println(sort(List.of("1", "3", "2")));
    }
}
