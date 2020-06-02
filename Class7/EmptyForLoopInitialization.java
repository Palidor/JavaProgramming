package Class7;

public class EmptyForLoopInitialization {
    public static void main(String args[]) {
        int i;

        i = 0; // Move initialization out of the loop
        for (; i < 10; ) {
            System.out.println("Pass #" + i);
            i++;
        }
    }
}