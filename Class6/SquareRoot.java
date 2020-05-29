package Class6;

/*
    Show square roots of 1 to 99 and the rounding error.
 */
public class SquareRoot {
    public static void main(String args[]) {
        double num, squareRoot, roundingError;

        for (num = 1.0; num < 100.0; num++) {
            squareRoot = Math.sqrt(num);
            System.out.println("Square root of " + num +
                    " is " + squareRoot);

            // squareRoot * squareRoot reverses the square root operation!
            // Because of rounding error, it won't be the same as our original
            // value "num"
            roundingError = num - (squareRoot * squareRoot);
            System.out.println("Rounding error is " + roundingError);
            System.out.println();
        }
    }
}
