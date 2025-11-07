package Examples.Chapter8;

import java.util.List;

interface Yawn {
    String yawn(double d, List<Integer> time);
}

class Sloth implements Yawn {
    public String yawn(double zzz, List<Integer> time) {
        return "Sleep: " + zzz;
    }
}

public class Vet {
    public static String takeNap(Yawn y) {
        return y.yawn(10, null);
    }

    public static void main(String... unused) {
        System.out.print(takeNap(new Sloth()));
        //System.out.print(takeNap((z,f) -> { String x = ""; return "Sleep: " + x })); a - error
        //System.out.print(takeNap((t,s) -> { String t = ""; return "Sleep: " + t; })); b - error, Variable 't' is already defined in the scope
        //System.out.print(takeNap((w,q) -> {"Sleep: " + w})); c - error, Not a statement
        //System.out.print(takeNap((e,u) -> { String g = ""; "Sleep: " + e })); d - error, Not a statement
        System.out.print(takeNap((a,b) -> "Sleep: " + (double)(b==null ? a : a))); //e - correct
        //System.out.print(takeNap((r,k) -> { String g = ""; return "Sleep:"; })); f - incorrect
    }
}
