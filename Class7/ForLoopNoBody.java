package Class7;

public class ForLoopNoBody {
    public static void main(String args[]) {
        int i;
        int sum = 0;

        // Add up each iteration of i to sum, over 5 times
        for (i = 1; i <= 5; sum += i++) ;

        System.out.println("Sum is " + sum);
    }
}