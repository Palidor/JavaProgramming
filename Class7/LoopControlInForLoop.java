package Class7;

/**
 * Declare loop control variable inside the for loop.
 */
public class LoopControlInForLoop {
    public static void main(String args[]) {
        int sum = 0;
        int factorial = 1;

        // compute the factorial of the numbers through 5
        for (int i = 1; i <= 5; i++) { // <- The variable i is declared inside the for statement
            sum += i;
            factorial *= i;
        }

        // but, i is not know here

        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + factorial);
    }
}