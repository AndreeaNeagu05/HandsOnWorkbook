package Examples.Chapter9;

public class Exercise15 {
    class W {}
    class X extends W {}
    class Y extends X {}
    class Z<Y> {
        W w1 = new W(); //a - compile
        W w2 = new X(); //b - compile
        //W w3 = new Y(); c - error
        //Y y1 = new W(); d - error
        //Y y2 = new X(); e - error
        //Y y3 = new Y(); f - error
    }
    public static void main(String[] args) {
        Exercise15 ex = new Exercise15();
        System.out.println("merge");
    }
}
