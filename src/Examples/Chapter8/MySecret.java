package Examples.Chapter8;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.UnaryOperator;

interface Secret {
    String magic(double d);
}

public class MySecret implements Secret {
    public String magic(double d) {
        return "Poof";
    }

    public static void main(String[] args) {
        Secret secret = new MySecret();
        UnaryOperator<Integer> u = x -> x * x;

        Secret secretLambda = (e) -> "Poof"; //a - correct
        //Secret secretLambda = (e) -> {"Poof"}; //b - error, not a statement
        //Secret secretLambda = (e) -> { String e = ""; "Poof" }; // c - error, not a statement
        //Secret secretLambda = (e) -> { String e = ""; return "Poof"; }; //d - error, Variable 'e' is already defined in the scope
        //Secret secretLambda = (e) -> { String e = ""; return "Poof" }; // e - error
        //Secret secretLambda = (e) -> { String f = ""; return "Poof"; }; //f - correct
        System.out.println(secret.magic(2.0)); // Output: Poof
        System.out.println(secretLambda.magic(2.0));
    }
}