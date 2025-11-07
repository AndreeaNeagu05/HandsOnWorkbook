package Examples.Chapter9;

import java.util.SequencedMap;
import java.util.TreeMap;

public class Exercise22 {
    public static void main(String[] args) {
        SequencedMap<Integer, String> cats = new TreeMap<>();
        cats.put(3, "Snowball");
        cats.put(2, "Sugar");
        cats.put(1, "Minnie Mouse");
        cats.pollFirstEntry();
        var id = cats.lastEntry().getKey();
        cats.pollFirstEntry();
        System.out.print(cats.firstEntry().getValue());
    }
}
