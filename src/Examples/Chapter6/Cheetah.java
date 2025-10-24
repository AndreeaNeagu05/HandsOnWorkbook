package Examples.Chapter6;

class Speedster {
    int numSpots;
}
public class Cheetah extends Speedster {
    int numSpots;

    public Cheetah(int numSpots) {
        //numSpots = numSpots; a
        //numSpots = this.numSpots; b
        //this.numSpots = numSpots; c
        //numSpots = super.numSpots; d
        super.numSpots = numSpots; //e
    }

    public static void main(String[] args) {
        Speedster s = new Cheetah(50);
        System.out.print(s.numSpots);
    }
}
