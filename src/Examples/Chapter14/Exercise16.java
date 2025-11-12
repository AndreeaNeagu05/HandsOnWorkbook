package Examples.Chapter14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise16 {
    public static void main(String[] args) {
        try {
            new Exercise16().echo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void echo() throws IOException {
        var o = new FileWriter("examples/zoo/new-zoo1.txt");
        try (var f = new FileReader("examples/zoo/zoo-data.txt");
             var b = new BufferedReader(f); o) {

            o.write(b.readLine());
        }
        o.write("");
    }
}
