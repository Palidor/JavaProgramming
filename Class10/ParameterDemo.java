package Class10;

/**
 * A simple example that uses a parameter.
 */
public class ParameterDemo {
    public static void main(String args[]) {
        CheckNumber checker = new CheckNumber();

        if (checker.isEven(10)) {
            System.out.println("10 is even.");
        }
        if (checker.isEven(9)) {
            System.out.println("9 is even.");
        }
        if (checker.isEven(8)) {
            System.out.println("8 is even.");
        }
    }
}

class CheckNumber {
    // return true if x is even
    boolean isEven(int number) {
        if ((number % 2) == 0) {
            return true;
        }
        return false;
    }
}