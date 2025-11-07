package Examples.Chapter8;

import java.util.Set;
import java.util.function.Consumer;

public class TestExercise19 {
    public static void main(String[] args){
        Set<?> set = Set.of("lion", "tiger", "bear");
        var s = Set.copyOf(set);
       // Consumer<Object> consumer = () -> System.out.println(s); a - does not compile
       // Consumer<Object> consumer = s -> System.out.println(s); b - Variable 's' is already defined in the scope
       //Consumer<Object> consumer = (s) -> System.out.println(s); c - Variable 's' is already defined in the scope
       //Consumer<Object> consumer = System.out.println(s); d - error
       //Consumer<Object> consumer = System::out::println; e - error
       Consumer<Object> consumer = System.out::println; //f - correct
        s.forEach(consumer);
    }
}
