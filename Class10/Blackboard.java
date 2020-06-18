package Class10;

public class Blackboard {
    public static void main(String args[]) {
        //
        // Methods
        //
        // "return-type" "method-name"("parameterlist") {
        //    // body of method
        // }
        // NOTE: A parameter list is a comma-delimited list of "type" "value" pairs
        // E.g.: (int count, String name, float speed)
        //
        // NOTE: If the method doesn't return a particular value, tehn return "void"
        //
        myMethod();
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
    }

    // Note: Ignore the word static for here. We'll come back to it!
    static void myMethod() {
        int i;

        for (i = 0; i < 10; i++) {
            if (i == 5) {
                return;
            }
            System.out.println("test");
        }
    }
}