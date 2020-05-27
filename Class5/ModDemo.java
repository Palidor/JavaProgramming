package Class5;

/*
    Demonstrate the % operator.
 */
public class ModDemo {
    public static void main(String args[]) {
        int result, remainder;
        double dResult, dRemainder;

        result = 10 / 3;
        remainder = 10 % 3;
        dResult = 10.0 / 3.0;
        dRemainder = 10.0 % 3.0;

        System.out.println("Result and remainder of 10 / 3: " +
                result + " " + remainder);
        System.out.println("Result and remainder of 10.0 / 3.0: " +
                dResult + " " + dRemainder);
    }
}