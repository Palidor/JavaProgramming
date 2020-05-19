package Class4;

/*
    Demonstrate boolean values.
*/
public class BoolDemo {
    public static void main(String args[]) {
        boolean myBoolean = false;
        System.out.println("myBoolean is: " + myBoolean);

        myBoolean = true;
        System.out.println("myBoolean is now: " + myBoolean);

        // a boolean value can control an if statement
        if (myBoolean) {
            System.out.println("This is executed.");
        }

        myBoolean = false;
        if (myBoolean) {
            System.out.println("This is not executed.");
        }

        myBoolean = !myBoolean;
        if (myBoolean) {
            System.out.println("This is also executed.");
        }

        boolean initialized = false;
        //First time program runs
        if (!initialized) {
            System.out.println("Initializing stuff!");
            initialized = true;
        } else {
            System.out.println("System already initialized! Not doing it again!");
        }
        //...
        //...
        // Second time program runs
        if (!initialized) {
            System.out.println("Initializing stuff!");
            initialized = true;
        } else {
            System.out.println("System already initialized! Not doing it again!");
        }
    }
}