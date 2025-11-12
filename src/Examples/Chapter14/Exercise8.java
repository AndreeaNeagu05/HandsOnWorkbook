package Examples.Chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Exercise8 {
    public static void main(String[] args) {
        Path path = Path.of("examples/fox/food-schedule.csv");
        Exercise8 ex = new Exercise8();
        try {
            ex.printData(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void printData(Path path) throws IOException {
//        Files.readAllLines(path) // r1
//                .flatMap(p -> Stream.of(p.split(","))) // r2
//                .map(q -> q.toUpperCase())  // r3
//                .forEach(System.out::println);
//    }
        Files.readAllLines(path).stream() // Convert List<String> to Stream<String>
                .flatMap(line -> Stream.of(line.split(","))) // Split each line by comma
                .map(String::toUpperCase) // Convert each element to uppercase
                .forEach(System.out::println); // Print each element
    }
}
