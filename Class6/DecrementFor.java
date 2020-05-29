package Class6;

/*
    A negatively running for loop.
 */
public class DecrementFor {
    public static void main(String args[]) {

        int x;

        for (x = 100; x > -100; x -= 5) {
            System.out.println(x);
        }
    }
}
