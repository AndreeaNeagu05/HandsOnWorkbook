package Examples.Chapter7;

public abstract interface Herbivore {
    int amount = 10;

    public void eatGrass();

    public default int chew() {
        return 13;
    }
}

abstract class IsAPlant implements Herbivore {
    Object eatGrass(int season) {
        return null;
    }
}
