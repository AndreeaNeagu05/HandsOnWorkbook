package Examples.Chapter11;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercise16 {
    public static void main(String[] args) {
        var f = DateTimeFormatter.ofPattern("hh o'clock");
        //System.out.println(f.format(ZonedTime.now())); a
        //System.out.println(f.format(LocalDate.now())); b - throws Exception
        //System.out.println(f.format(LocalTimestamp.now())); c
        System.out.println(f.format(LocalTime.now())); //d - throws Exception
    }
}
