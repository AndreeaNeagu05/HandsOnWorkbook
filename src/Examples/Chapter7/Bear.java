package Examples.Chapter7;

public class Bear {
    enum FOOD {
        BERRIES {
            @Override
            public boolean isHealthy() {
                return false;
            }
        }, INSECTS {
            public boolean isHealthy() { return true; }},
        FISH {
            @Override
            public boolean isHealthy() {
                return false;
            }
        }, ROOTS {
            @Override
            public boolean isHealthy() {
                return false;
            }
        }, COOKIES {
            @Override
            public boolean isHealthy() {
                return false;
            }
        }, HONEY {
            @Override
            public boolean isHealthy() {
                return false;
            }
        };
        public abstract boolean isHealthy();
    }
    public static void main(String[] args) {
        System.out.print(FOOD.INSECTS);
        System.out.print(FOOD.INSECTS.ordinal());
        System.out.print(FOOD.INSECTS.isHealthy());
        System.out.print(FOOD.COOKIES.isHealthy());
    } }
