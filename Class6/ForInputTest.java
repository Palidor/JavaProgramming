package Class6;

import java.io.IOException;

/*
    Loop until an S is typed.
 */
public class ForInputTest {
    public static void main(String args[])
       throws IOException {

        int i;

        System.out.print("Press S to stop.");

        for (i=0; (char) System.in.read() != 'S'; i++) {
            System.out.println("Pass #" + i);
        }
    }
}
