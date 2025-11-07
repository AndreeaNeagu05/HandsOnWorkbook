package Examples.Chapter8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class TestUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> u = x -> x * x;

        //BiFunction<Integer> f = x -> x*x; //a - error, BiFunction requires two parameters
        //BiFunction<Integer, Integer> f = x -> x*x; //b-error, BiFunction requires two parameters
        //BinaryOperator<Integer, Integer> f = x -> x*x; //c - error, BinaryOperator requires two parameters
        //Function<Integer, Integer> f = x -> x * x; //d - correct
        Function<Integer, Integer> f = x -> x*x; // e - correct

        System.out.println("UnaryOperator: " + u.apply(5));
        System.out.println("Function: " + f.apply(5));
    }
}

