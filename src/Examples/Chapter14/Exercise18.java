package Examples.Chapter14;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class Exercise18 {
    public static void main(String[] args) throws IOException {
        var sb = new StringBuilder();
        byte[] data = "PEACOCKS".getBytes();
        FilterInputStream reader = new FilterInputStream(new ByteArrayInputStream(data)) {};
        sb.append((char) reader.read());
        reader.mark(10);
        for (int i = 0; i < 2; i++) {
            sb.append((char) reader.read());
            reader.skip(2);
        }
        reader.reset();
        reader.skip(0);
        sb.append((char) reader.read());
        System.out.println(sb.toString());
    }
}
