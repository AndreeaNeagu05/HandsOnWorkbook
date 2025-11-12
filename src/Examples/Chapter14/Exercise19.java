package Examples.Chapter14;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercise19 {
    public static void main(String[] args) throws IOException {
        var p1 = Path.of("examples/lizard", ".").resolve(Path.of("walking.txt"));
        var p2 = new File("examples/lizard/././actions/../walking.txt").toPath();
        System.out.print(Files.isSameFile(p1, p2));
        System.out.print(" ");
        System.out.print(p1.equals(p2));
        System.out.print(" ");
        System.out.print(Files.mismatch(p1, p2));
    }
}
