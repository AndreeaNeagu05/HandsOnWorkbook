package Examples.Chapter9;

import java.util.TreeSet;

public class Exercise23 {
    public static void main(String[] args) {
        var fishes = new TreeSet<String>();
        fishes.add("Koi");
        fishes.addFirst("clown");
        fishes.add("carp");
        for (var fish : fishes)
            System.out.print(fish + ", ");
    }
}
