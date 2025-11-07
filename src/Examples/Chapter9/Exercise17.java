package Examples.Chapter9;

import java.util.HashMap;
import java.util.Map;

public class Exercise17 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(123, "456");
        m.put("abc", "def");
        //System.out.println(m.contains("123")); doesn't compile because Map doesn't have contains method
        System.out.println(m.containsKey("123"));
    }
}
