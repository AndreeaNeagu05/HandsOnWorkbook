package Examples.Chapter11;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Exercise9 {
    public static void main(String[] args) {
        //String pattern = "##.#"; //a - <5.2> <8.5> <1234>
        //String pattern = "0,000.0#"; //b - <0,005.21> <0,008.49> <1,234.0>
        //String pattern = "#,###.0"; //c - <5.2> <8.5> <1,234.0>
        String pattern = "#,###,000.0#"; //d - <005.21> <008.49> <1,234.0> - correct
        var message = DoubleStream.of(5.21, 8.49, 1234)
                .mapToObj(v -> new DecimalFormat(pattern).format(v))
                .collect(Collectors.joining("> <"));
        System.out.println("<"+message+">");
    }
}
