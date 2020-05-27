package Class5;

/*
    Demonstrate the short-circuit operators.
 */
public class ShortCircuitOps {
    public static void main(String args[]) {
        int n, d;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0) {
            System.out.println("d " + "is a factor of " + n);
        }

        d = 0; // Now set d to zero

        // Since d is zero, we expect the second operandnot to be evaluated.
        if (d != 0 && (n % d) == 0) {
            System.out.println("d " + "is a factor of " + n);
        }

        /*
          Now, let's try the same thing without the short-circuit
          operator.
         */
        if (d != 0 & (n % d) == 0) {
            System.out.println("d " + "is a factor of " + n);
        }
    }
}