package Class7;

/**
 * Demonstrate the do-while loop.
 */
public class DoWhile {
    public static void main(String args[])
        throws java.io.IOException {

        char ch;

        do {
            System.out.println("Press a key followed by ENTER: ");
            ch = (char) System.in.read(); // gets a char
        } while (ch != 'q');
        System.out.println("Done!");
    }
}