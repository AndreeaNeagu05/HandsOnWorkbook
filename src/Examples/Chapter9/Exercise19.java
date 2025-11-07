package Examples.Chapter9;

public class Exercise19 {
    public static void main(String[] args) {
        Integer i = identity(123);
        String s = identity("Hello");
        System.out.println(i);
        System.out.println(s);
    }
    //public <T> static T identity(T t) { a - error
    public static <T> T identity(T t) { //b - compile
    //public static T <T> identity(T t) { c - error
    //public <?> static T identity(T t) { d - error
    //public static <?> T identity(T t) { e - error
    //public static T identity(T t) { f - error
        return t;
    }
}
