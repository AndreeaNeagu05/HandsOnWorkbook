package Examples.Chapter11;

import java.io.IOException;

public class Exercise1 {
    public static void main(String[] args) {
        Exercise1 ex = new Exercise1();
        try {
            ex.whatHappensNext();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void whatHappensNext() throws IOException {
        System.out.println("it’s ok"); // a - correct
        //throw new Exception(); b - error, Unhandled exception: java.lang.Exception
        //throw new IllegalArgumentException(); c - correct
        //throw new java.io.IOException(); d - correct
        //throw new RuntimeException(); e - correct
    }
}
