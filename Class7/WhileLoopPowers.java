package Class7;

public class WhileLoopPowers {
    public static void main(String args[]) {
        // I want to calculate 2^0 through 2^9
        // A power is 2 * 2 * 2 ... * 2 =
        // a.k.a. 2^n, where n is the number of loops
        int result;
        int exponent;

        for (int i = 0; i < 10; i++) {
            result = 1;
            exponent = i;
            while (exponent > 0) {
                result *= 2; // You could drive this by a variable!
                --exponent;
            }

            System.out.println("2 to the " + i + " power is " + result);
        }
    }
}