package Class6;

import java.io.IOException;

/*
    Guess the letter game. Third version.
 */
public class GuessGame3 {
    public static void main(String args[])
        throws IOException {

        char input, answer = 'K';

        System.out.println("I'm thinking of a letter between 'A' and 'Z'");
        System.out.println("Can you guess it?");

        input = (char) System.in.read();

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
    }
}