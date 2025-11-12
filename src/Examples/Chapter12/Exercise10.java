package Examples.Chapter12;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class Exercise10 {
    public static void main(String[] args) {
        SequencedCollection<Integer> lions = new ArrayList<>(List.of(1, 2, 3));
        SequencedCollection<Integer> tigers = new CopyOnWriteArrayList<>(lions);
        Set<Integer> bears = new ConcurrentSkipListSet<>();
        bears.addAll(lions);
        for (Integer item: tigers) tigers.add(Integer.valueOf(4)); // x1
        for (Integer item: bears) bears.add(Integer.valueOf(5));   // x2
        System.out.println(lions.size() + " " + tigers.size()
                + " " + bears.size());
    }
}
