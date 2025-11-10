package Examples.Chapter11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exercise7 {
    public static void main(String[] args) {
        Exercise7 ex = new Exercise7();
        try {
            ex.tryAgain("Hello");
        } catch (FileNotFoundException e) {
            System.out.print("E");
        }
    }

//    public void tryAgain(String s) {
//        try (FileReader r = null,p=new FileReader("")){
//            System.out.print("X");
//            throw new IllegalArgumentException();
//        } catch(Exception s){
//            System.out.print("A");
//            throw new FileNotFoundException();
//        } finally{
//            System.out.print("O");
//        }
//    }


    public void tryAgain(String s) throws FileNotFoundException {
        try (FileReader r = new FileReader("")) {
            System.out.print("X");
            throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.print("A");
            throw new FileNotFoundException();
        } finally {
            System.out.print("O");
        }
    }
}
