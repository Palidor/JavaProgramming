package Class8;

/**
 * This program contains an error.
 */
public class BreakLabelError {
    public static void main(String args[]) {

        one: for(int i = 0; i < 3; i++) {
            System.out.print("Pass " + i + " : ");
        }

        for(int j = 0; j < 100; j++) {
            if (j == 10) break one; // WRONG!!!!
            System.out.println(j + " ");
        }
    }
}