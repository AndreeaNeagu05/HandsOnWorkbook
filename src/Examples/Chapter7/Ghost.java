package Examples.Chapter7;

public class Ghost {
    public static void boo() {
        System.out.println("Not scared");
    }
    protected class Spirit {
        public void boo() {
            System.out.println("Booo!!!");
        }
    }
    public static void main(String... haunt) {
        var g = new Ghost().new Spirit() {};
        //g.boo(); a
        //g.super.boo(); b
        //new Ghost().boo(); c
        //g.Ghost.boo(); d
        //new Spirit().boo(); e
    } }
