package Class4;

/*
    Character variables can be handled like integers.
*/
public class CharArithDemo {
    public static void main(String args[]) {
        char myChar = 'X';
        System.out.println("This is myChar: " + myChar);
        myChar += 1; // myChar++, ++myChar, myChar = myChar + 1
        System.out.println("myChar is now: " + myChar);
        myChar = 90;
        System.out.println("myChar is now: " + myChar);
    }
}