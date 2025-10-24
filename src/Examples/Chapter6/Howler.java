package Examples.Chapter6;

public class Howler {
    public Howler(long shadow) {
        this(3); //a
        //this(); b - error no default constructor
        //this((short)1); c
        //super(); d - error no constructor
        //this(2L); e - recursive constructor invocation
        //this(5); f
    }

    private Howler(int moon) {
        super();
    }
}

class Wolf extends Howler {
    protected Wolf(String stars) {
        super(2L);
    }

    public Wolf() {
        this(""); //a
        //super(1); b
        //this(null); c
        //super(); d
        //super((short)2); e
        //super(null); f - no suitable constructor
    }

    public static void main(String[] args) {
        System.out.println("Howl");
    }
}