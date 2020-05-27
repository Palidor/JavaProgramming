package Class5;

/*
    *** This program will not compile. ***
 */
public class LongToDoubleError {
    public static void main(String args[]) {
        long L;
        double D;

        L = 105782955L;
        L = D;
        // LongToDoubleError.java:12: error: incompatible types: possible lossy conversion from double to long

        System.out.println("L and D: " + L + ", " + D);
    }
}