package Examples.Chapter7;

interface CanHop {
}

public class Frog implements CanHop {
    public static void main(String[] args) {
        Frog frog = new TurtleFrog(); //a - compile
        TurtleFrog frog1 = new TurtleFrog(); //b - compile
        //BrazilianHornedFrog frog2 = new TurtleFrog(); //c - doesn't compile
        CanHop frog3 = new TurtleFrog(); //d- compile
        var frog4 = new TurtleFrog(); //e - compile
        //Long frog5 = new TurtleFrog(); //f - doesn't compile
    }
}

class BrazilianHornedFrog extends Frog {
}

class TurtleFrog extends Frog {
}
