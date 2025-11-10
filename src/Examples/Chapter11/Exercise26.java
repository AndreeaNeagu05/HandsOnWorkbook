package Examples.Chapter11;

import java.io.IOException;

public class Exercise26 {
    void rollOut() throws ClassCastException {}

    public void transform(String c) {
        try {
            rollOut();
       // } catch (IllegalArgumentException | IOException a) { a - Exception 'java.io.IOException' is never thrown in the corresponding try bloc
       // } catch (IllegalArgumentException | Error b) { b - correct
        //} catch (IllegalArgumentException | NullPointerException c) { c - Variable 'c' is already defined in the scope
        //} catch (IllegalArgumentException | RuntimeException d) { d - Types in multi-catch must be disjoint: 'java.lang.IllegalArgumentException' is a subclass of 'java.lang.RuntimeException'
        //} catch (IllegalArgumentException | NumberFormatException e) { e - Types in multi-catch must be disjoint: 'java.lang.NumberFormatException' is a subclass of 'java.lang.IllegalArgumentException'
        } catch (IllegalArgumentException | ClassCastException f) { //f -correct
        }
    }

    public static void main(String[] args) {
    }
}
