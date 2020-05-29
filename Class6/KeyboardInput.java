package Class6;

import java.io.IOException;

/*
    Read a character from the keyboard.
 */
public class KeyboardInput {
    public static void main(String args[])
        throws IOException {

        char input;

        System.out.println("Press a key, then press ENTER");
        input = (char) System.in.read(); // gets a char
        System.out.println("Your key is: " + input);
    }
}