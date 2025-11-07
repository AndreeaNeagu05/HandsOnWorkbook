package Examples.Chapter8;

import java.util.function.Predicate;

public class Hyena {
    private int age = 1;

    public static void main(String[] args) {
        var p = new Hyena();
        double height = 10;
        int age = 1;
        //testLaugh(p, var -> p.age <= 10); //a - correct
        //testLaugh(p, shenzi -> age==1); //b - error, Variable used in lambda expression should be final or effectively final
        //testLaugh(p, p -> true); //c - error, Variable 'p' is already defined in the scope
        //testLaugh(p, age==1); //d - error
        //testLaugh(p, shenzi -> age==2); //e - error, Variable used in lambda expression should be final or effectively final
        testLaugh(p, h -> h.age < 5); //f - correct
        age = 2;
    }

    static void testLaugh(Hyena panda, Predicate<Hyena> joke) {
        var r = joke.test(panda) ? "hahaha" : "silence";
        System.out.print(r);
    }
}
