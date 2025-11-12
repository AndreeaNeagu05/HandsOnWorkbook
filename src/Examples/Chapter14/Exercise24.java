package Examples.Chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Exercise24 {
    public static void main(String[] args) {
        try {
            var source = Files.createTempFile("sounds", ".txt");
            Files.writeString(source, "click click click");
            new Exercise24().copyIntoFlipDirectory(source);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void copyIntoFlipDirectory(Path source) throws IOException {
        var dolphinDir = Path.of("examples/flip");
        dolphinDir = Files.createDirectories(dolphinDir);
        var n = Path.of("sounds.txt");
        Files.copy(source, dolphinDir.resolve(n), StandardCopyOption.REPLACE_EXISTING);
    }
}
