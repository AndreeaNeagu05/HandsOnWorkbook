package Examples.Chapter6;

abstract class Bird1 {
    private final void fly() {
        System.out.println("Bird");
    }

    protected Bird1() {
        System.out.print("Wow-");
    }
}

public class Pelican extends Bird1 {
    public Pelican() {
        System.out.print("Oh-");
    }

    protected void fly() {
        System.out.println("Pelican");
    }

    public static void main(String[] args) {
        var chirp = new Pelican();
        chirp.fly();
    }
}
