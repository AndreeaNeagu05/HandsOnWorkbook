package Examples.Chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Exercise20 {
    public static void main(String[] args) throws IOException {
        Files.move(Path.of("monkey.txt"), Path.of("examples/animals"),
                StandardCopyOption.ATOMIC_MOVE);
    }
}
