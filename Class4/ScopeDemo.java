package Class4;

/*
    Demonstrate block scope.
*/
public class ScopeDemo {
    public static void main(String args[]) {
        int x; // known to all code within main

        {
            // This can be valid! We'll come back to this later
            int z = 10;
        }

        x = 10;
        if (x == 10) { // starts a new scope!

            int y = 20; // known only to THIS block!

            // x and y are both known here
            x = y * 2;
        }
        // y = 100; // Error! y not known here

        // x is still known here
        System.out.println("x is " + x);
    }
}