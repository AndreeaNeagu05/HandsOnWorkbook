package Examples.Chapter9;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> q = new ArrayList<>(List.of("mouse", "parrot"));
        List<String> v = new ArrayList<>(List.of("mouse", "parrot"));

        q.removeIf(String::isEmpty);
        q.removeIf(s -> s.length() == 4);
        v.removeIf(String::isEmpty);
        v.removeIf(s -> s.length() == 4);

        System.out.println("q" + q);
        System.out.println("v" + v);
    }
}
