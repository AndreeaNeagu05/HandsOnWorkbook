package Examples.Chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercise5 {
    public static void main(String[] args) {
        Path path = Path.of("/animals");
        try (var z = Files.walk(path)) {
            boolean b = z
                    .filter(p -> Files.isDirectory(p) && !path.equals(p))
                    .findFirst().isPresent();
            System.out.print(b ? "Has Sub" : "No Sub");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
