package Examples.Chapter9;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Exercise16 {
    public static void main(String[] args) {
        //List<Integer> q = new LinkedList<>(); a - correct [10]
        //Queue<Integer> q = new LinkedList<>(); b - false [10, 12]
        var q = new LinkedList<>(); //c - correct [10]
        var u = Collections.unmodifiableCollection(q);
        q.add(10);
        q.add(12);
        q.remove(1);
        System.out.print(u);
    }
}
