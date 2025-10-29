package Examples.Chapter7;

public class Favorites {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY;

        Flavors() {
        }
    }

    public static void main(String[] args) {
        for (final var e : Flavors.values())
            System.out.print((e.ordinal() % 2) + " ");
    }
}
