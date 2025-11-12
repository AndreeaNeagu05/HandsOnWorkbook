package Examples.Chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Exercise21 {
    public static void main(String[] args) throws IOException {
        var f = Path.of("examples/monkeys");
        try (var m =
                     Files.find(f, 0, (p, a) -> a.isSymbolicLink())) { // y1
            m.map(s -> s.toString())
                    .collect(Collectors.toList())
                    .stream()
                    .filter(s -> s.toString().endsWith(".txt")) // y2
                    .forEach(System.out::println);
        }
    }
}
