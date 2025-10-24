package Examples.Chapter6;

    public class BirdSeed {
        private int numberBags;
        boolean call;

        public BirdSeed() {
            // LINE 1
            //BirdSeed(2); a - error
            //new BirdSeed(2); c - result 0
            this(2); //e - result 2
            call = false;
            // LINE 2
            //BirdSeed(2); b - error
            //new BirdSeed(2); d - result 0
            //this(2); f - error, constructor call must be first statement
        }

        public BirdSeed(int numberBags) {
            this.numberBags = numberBags;
        }

        public static void main(String[] args) {
            var seed = new BirdSeed();
            System.out.print(seed.numberBags);
        }
    }

