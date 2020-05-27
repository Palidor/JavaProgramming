package Class5;

/*
    Demonstrate automatic conversion from long to double.
 */
public class LongToDouble {
    public static void main(String args[]) {
        long L;
        double D;

        L = 105782955L;
        D = L;

        System.out.println("L and D: " + L + ", " + D);
    }
}