package Examples.Chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class Exercise12 {
    public static void main(String[] args) throws IOException {
        var p = Path.of("sloth.schedule");
        var a = Files.readAttributes(p, BasicFileAttributes.class);
        Files.isDirectory(p.resolve(".backup"));
        if (a.size() > 0 && a.isDirectory()) {
            a.size();
        }
    }
}
