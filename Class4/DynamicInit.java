package Class4;

/*
    Demonstrate dynamic initialization.
*/
public class DynamicInit {
    public static void main(String args[]) {
        double radius = 4, height = 5;

        // dynamically initialize the volume
        double volume = 3.1416 * radius * radius * height;

        System.out.println("Volume is " + volume);
    }
}