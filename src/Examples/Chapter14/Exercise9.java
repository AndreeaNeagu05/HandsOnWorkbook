package Examples.Chapter14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Exercise9 {
    public static void main(String[] args) {
        var ex = new Exercise9();
        try {
            ex.copyFile(
                    new File("examples/file/file1.csv"),
                    new File("examples/file/file1-copy.csv")
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void copyFile(File file1, File file2) throws Exception {
        var reader = new InputStreamReader(new FileInputStream(file1));
        try (var writer = new FileWriter(file2)) {
            char[] buffer = new char[5];
            while(reader.read(buffer) != -1) {
                writer.write(buffer);
                // n1
            }
        }
    }
}
