package Examples.Chapter7;

abstract class Snake {
}

class Cobra extends Snake {
}

class GardenSnake extends Cobra {
}

public class SnakeHandler {
    private Snake snakey;

    public void setSnake(Snake mySnake) {
        this.snakey = mySnake;
    }

    public static void main(String[] args) {
        //new SnakeHandler().setSnake(new Cobra()); //a- compile
        //new SnakeHandler().setSnake(new Snake()); //b - doesn't compile, Snake is abstract, and cannot be instantiated
        //new SnakeHandler().setSnake(new Object()); //c - doesn't compile, cast argument type Object to Snake
        //new SnakeHandler().setSnake(new String("Snake")); //d - doesn't compile
        //new SnakeHandler().setSnake(new GardenSnake()); //e - compile
        new SnakeHandler().setSnake(null); //f - compile
    }
}
