package Examples.Chapter9;

import java.io.FileNotFoundException;

public class Helper {
    public static <U extends Exception>
    void printException(U u) {

        System.out.println(u.getMessage());
    }

    public static void main(String[] args) {
        Helper.printException(new FileNotFoundException("A")); //a - compile
        Helper.printException(new Exception("B")); //b - compile
        //Helper.<Throwable>printException(new Exception("C")); c - error
        Helper.<NullPointerException>printException(new NullPointerException("D")); //d - compile
        //Helper.printException(new Throwable("E")); e - error
    }
}
