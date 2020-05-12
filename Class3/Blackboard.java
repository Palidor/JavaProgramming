package Class3;

/*
    Compute the number of cubic inches
    in 1 cubic mile.
*/
public class Blackboard {
    public static void main(String args[]) {

        /*
        for(initialization; condition; iteration) statement;

        for(initialization; condition; iteration) {
            statement1;
            statement2;

        What is a condition? A condition is essentially a boolean statement.
        What is boolean? It's True or False.
        value < 10
        value > 5

        What is initialization? It's essentially the a variable of some sort that is
        set to an initial value.
        int value = 0

        What is the iteration?
        The iteration is updating the vlue we initialized, that the condition checks.
        value = value + 1
        value += 1
        ++value (pre-increment)
        value++ (post-increment)
        }
         */

        for(int value = 0; value < 10; value += 1) {
            System.out.println(String.format("My value is %d", value));
        }

        // Positioning and formatting (code formatting)
        //int x;
        //int y;
        //int x, y;
        int x = 0, y = 1;
        // Notate like this...
        x = y;
        y = y + 1;
        System.out.println(x + " " + y);
        // or i can notate like this
        // NOTE: DON'T DO THIS! DON'T BE THAT GUY!
        x = y; y = y + 1; System.out.println(x + " " + y);

        // Example of a method that doesn't fix on one line
        int z = 0;
        System.out.println("This is a long line of output " +
                           x + y + z +
                           " more output");

        // Special Reserved Keywords!
        // true, false, null

        // Data Types: Primitives
        // boolean, byte (8-bit integer), chat, double, float, int, long short

        // Integer (whole value types)
        // byte:        8-bits      -128 to 127
        // short:       16-bits     -32,768 to 32,767
        // int:         32-bits     -2,147,483,648 to 2,147,483,647
        // long:        64-bits     -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        // Floating-point (Real Numbers)
        // float:       32-bits
        // double:      64-bits
    }
}