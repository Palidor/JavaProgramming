package Class10;

/**
 * An example to find out if two numbers are factors of each other.
 */
public class IsFactorDemo {
    public static void main(String args[]) {
        Factor checker = new Factor();

        if (checker.isFactor(20, 2)) {
            System.out.println("2 is a factor");
        }
        if (checker.isFactor(20, 3)) {
            System.out.println("3 is a factor");
        }
    }
}

class Factor {
    boolean isFactor(int a, int b) {
        if ((a % b) == 0) {
            return true;
        }
        return false;
    }
}