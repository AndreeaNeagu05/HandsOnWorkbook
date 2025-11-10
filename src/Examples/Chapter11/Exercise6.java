package Examples.Chapter11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise6 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2025-04-30",
                DateTimeFormatter.ISO_LOCAL_DATE_TIME);
//        LocalDate date = LocalDate.parse("2025-04-30T10:15:30",
//                DateTimeFormatter.ISO_LOCAL_DATE_TIME);  It expects both time and date
        System.out.println(date.getYear() + " "
                + date.getMonth() + " "+ date.getDayOfMonth());
    }
}
