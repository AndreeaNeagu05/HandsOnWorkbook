package Examples.Chapter11;

import java.util.Locale;
public class ReadMap implements AutoCloseable {
    private Locale locale;
    private boolean closed = false;
    @Override public void close() {
        System.out.println("Folding map");
        locale = null;
        closed = true;
    }
    public void open() {
        //this.locale = Locale.of("xM");
        this.locale = Locale.of("MQ", "ks");
        //this.locale = Locale.of("qw");
        //this.locale = Locale.of("wp", "VW");
        //this.locale = Locale.create("zp");
        //new Locale.Builder().setLanguage("yw").setRegion("PM");
    }
    public void use() {
        // Implementation omitted
    }

    public static void main(String[] args) {
        try (ReadMap map = new ReadMap()) {
            map.open();
            map.use();
        }
    }
}