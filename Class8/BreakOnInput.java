package Class8;

/**
 * Read input until a q is received.
 */
public class BreakOnInput {
    public static void main(String args[])
        throws java.io.IOException {

        char input;

        for ( ; ; ) {
            System.out.println("Enter a key: ");
            input = (char) System.in.read();
            if (input == 'q') {
                break;
            }
        }
        System.out.println("You pressed q!");
    }
}