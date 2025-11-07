package Examples.Chapter9;

import java.util.ArrayDeque;

public class Greetings {
    public static void main(String[] args) {
        var greetings = new ArrayDeque<String>();
        greetings.offerLast("hello"); //[hello]
        greetings.offerLast("hi"); //[hello, hi]
        greetings.offerFirst("ola"); //[ola, hello, hi]
        greetings.pop(); //[hello, hi]
        greetings.peek(); //[hello, hi]
        while (greetings.peek() != null)
            System.out.print(greetings.pop());
    }
}
