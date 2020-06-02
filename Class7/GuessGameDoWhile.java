package Class7;

public class GuessGameDoWhile {
    public static void main(String args[])
        throws java.io.IOException {

            char input, ignore, answer = 'K';

            do {
                System.out.println("I'm thinking of a letter between 'A' and 'Z'");
                System.out.println("Can you guess it?");

                input = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n'); // A new line is '\n'

                if (input == answer) {
                    System.out.println("** RIGHT!!! **");
                } else {
                    System.out.println("...Sorry, you're wrong.");

                    if (input < answer) {
                        System.out.println("Too low!");
                    }
                    if (input > answer) {
                        System.out.println("Too high!");
                    }
                }
            } while (input != answer);
    }
}