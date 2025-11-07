package Examples.Chapter8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveChar {
    public void remove(List<Character> chars) {
        char end = 'z';
        //char start = 'a'; a - error
        //char c = 'x'; b - error
        chars = null;
        //end = '1'; d - error

        Predicate<Character> predicate = c -> {
            char start = 'a';
            return start <= c && c <= end;
        };
    }

    public static void main(String[] args) {
        List<Character> chars = new ArrayList<>();
        chars.add('a');
        chars.add('b');
        chars.add('1');
        chars.add('z');
        chars.add('A');

        RemoveChar rc = new RemoveChar();
        rc.remove(chars);

        System.out.println(chars); // Output: [a, b, z]
    }
}
