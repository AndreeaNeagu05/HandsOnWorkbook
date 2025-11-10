package Examples.Chapter11;

import java.text.NumberFormat;
import java.util.Locale;

public class Exercise5 {
    public static void main(String[] args) {
        Exercise5 ex = new Exercise5();
        ex.print(100_102.2);
    }

    public void print(double t) {
        System.out.print(NumberFormat.getCompactNumberInstance().format(t));

        System.out.print(
                NumberFormat.getCompactNumberInstance(
                        Locale.getDefault(), NumberFormat.Style.SHORT).format(t));

        System.out.print(NumberFormat.getCurrencyInstance().format(t));
    }
}
