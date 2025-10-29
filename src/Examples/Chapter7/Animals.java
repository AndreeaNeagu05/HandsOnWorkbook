package Examples.Chapter7;

import java.util.List;

public enum Animals {
    MAMMAL(List.of(2, 4)),
    INVERTEBRATE(List.of(2, 4, 6, 8, 100)),
    BIRD(null) {
        public int stand() {
            return legs.get(0) + 4;
        }
    };
    List<Integer> legs;

    Animals(List<Integer> legs) {
        this.legs = legs;
    }

    public int stand() {
        return legs.get(0);
    }

    public static void main(String[] a) {
        Animals.BIRD.legs = List.of(-1);
        System.out.println(Animals.BIRD.stand());
    }
}