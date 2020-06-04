package Class8;

/**
 * Using break to exit a loop.
 */
public class BreakDemo {
    public static void main(String args[]) {
        int num;

        num = 100;
        for (int i = 0; i < num; i++) {
            if (i * i >= num) {
                break; // terminate the loop if i*i >= 100
            }
            System.out.println(i + " ");
        }
        System.out.println("Loop complete.");
    }
}