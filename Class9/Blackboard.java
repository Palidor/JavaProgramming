package Class9;

public class Blackboard {
    public static void main(String args[]) {
        //
        // Class Structure
        //
        // class "classname" {
        //     // declare instance variables
        //     "type" "variableName1"
        //     "type" "variableName2"
        //     // ...
        //     "type" "variableNameN"
        //
        //     // declare methods
        //     "returnType" "methodName1"("parameters") {
        //         //body of method
        //     }
        //     "returnType" "methodName2"("parameters") {
        //         //body of method
        //     }
        //     // ...
        //     "returnType" "methodNameN"("parameters") {
        //         //body of method
        //     }
        // }
        //
        // Calling a method on a class
        //
        // object.method("parameters")
        //
        // Accessing a member on a class
        //
        // object.membervariable


        // This will be null until it's assigned!
        Vehicle minivan; // declare reference to object
        minivan = new Vehicle();

        // Assignment of class variables
        Vehicle car1 = new Vehicle();
        Vehicle car2 = car1;
        Vehicle car3 = new Vehicle();

        // This will change car 2 as well!
        car1.mpg = 26;
        //System.out.println(car1.mpg);
        //System.out.println(car2.mpg);

        car2 = car3; // now car2 and car3 refer to the same object

        car1.mpg = 10;
        //System.out.println(car1.mpg);
        //System.out.println(car2.mpg);
    }
}

class Vehicle {
    int passengers;     // number of passengers
    int fuelcap;        // fuel capacity in gallons
    int mpg;            // fuel consumption in miles per gallon
}
