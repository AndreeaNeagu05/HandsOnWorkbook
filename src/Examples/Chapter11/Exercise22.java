package Examples.Chapter11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise22 {
    public static void main(String[] args) {
        try {
            LocalDateTime book = LocalDateTime.of(2025, 4, 5, 12, 30, 20);
            System.out.print(book.format(DateTimeFormatter.ofPattern("m")));
            System.out.print(book.format(DateTimeFormatter.ofPattern("z")));
            System.out.print(DateTimeFormatter.ofPattern("y").format(book));
        } catch (Throwable e) {
        }
    }
}
