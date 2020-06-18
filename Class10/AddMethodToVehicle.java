package Class10;

/**
 * Add a method to the Vehicle class.
 */
public class AddMethodToVehicle {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        // Assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passengers + ". ");
        minivan.range();

        System.out.print("Sportscar can carry " + sportscar.passengers + ". ");
        sportscar.range();
    }
}

class Vehicle {
    int passengers;     // number of passengers
    int fuelcap;        // fuel capacity in gallons
    int mpg;            // fuel consumption in miles per gallon

    void range() {
        System.out.println("Vehicle has a range of " + (this.fuelcap * this.mpg));
    }
}