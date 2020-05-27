package Class5;

/*
    A promotion surprise!
 */
public class PromotionDemo {
    public static void main(String args[]) {
        byte b;
        int i;

        b = 10;
        i = b * b; // This is OK! No cast is needed because the result is already evaluated to an int

        b = 10;
        b = (byte) (b * b); // cast needed here to assign an int to a byte!

        System.out.println("i and b: " + i + ", " + b);
    }
}