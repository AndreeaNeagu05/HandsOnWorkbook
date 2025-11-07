package Examples.Chapter9;

import java.io.IOException;
import java.util.*;

public class Wildcard {
    public void showSize(List<?> list) {
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        Wildcard card = new Wildcard();
        //List<?> list = new HashSet<String>(); a - error
        //ArrayList<? super Date> list = new ArrayList<Date>(); //b - compile
        //List<?> list = new ArrayList<?>(); c - error
        //List<Exception> list = new LinkedList<IOException>(); d - error
        ArrayList <? extends Number> list = new ArrayList <Integer>(); //e - compile
        card.showSize(list);
    }
}
