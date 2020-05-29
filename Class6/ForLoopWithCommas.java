package Class6;

/*
    Use commas in a for statement.
 */
public class ForLoopWithCommas {
    public static void main(String args[]) {

        int i, j;

        for (i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i and j: " + i + ", " + j);
        }
    }
}
