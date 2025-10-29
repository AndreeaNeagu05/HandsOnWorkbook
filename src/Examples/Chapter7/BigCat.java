package Examples.Chapter7;

public interface BigCat {
    static String getName() {
        return null;
    }

    static int hunt() {
        getName();
        return 5;
    }

    static void climb() {
        rest();
    }

    private static void roar() {
        getName();
        climb();
        hunt();
    }

    private static boolean sneak() {
        roar();
        return true;
    }

    private static int rest() {
        return 2;
    }

    ;
}