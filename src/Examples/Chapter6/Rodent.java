package Examples.Chapter6;

public class Rodent {
    public Rodent(Integer x) {
    }

    protected static Integer chew() throws Exception {
        System.out.println("Rodent is chewing");
        return 1;
    }
}

class Beaver extends Rodent {
    public Beaver(Integer x) {
        super(x);
    }

    public static Integer chew() throws RuntimeException {
        System.out.println("Beaver is chewing on wood");
        return 2;
    }
    public static void main(String[] args) {
        System.out.println("aaa");
    }
}