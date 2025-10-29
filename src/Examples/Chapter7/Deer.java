package Examples.Chapter7;

public class Deer {
    enum Food {APPLES, BERRIES, GRASS}
    protected static class Diet {
        private Food getFavorite() {
            return Food.BERRIES;
        }
    }
    public static void main(String[] seasons) {
        System.out.print(switch(new Diet().getFavorite()) {
            case APPLES -> "a";
            case BERRIES -> "b";
            default -> "c";
        });
    } }
