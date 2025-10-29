package Examples.Chapter7;

interface Aquatic {
    int getNumOfGills(int p);
}

public class ClownFish implements Aquatic {
    String getNumOfGills() {
        return "14";
    }

    public int getNumOfGills(int input) {
        return 15;
    }

    public static void main(String[] args) {
        System.out.println(new ClownFish().getNumOfGills(-1));
    }
}