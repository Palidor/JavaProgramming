package Class11;

public class VehicleConstructorDemo {
    public static void main(String args[]) {

        // construct complete vehicles
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);

        double gallons;
        int distance = 243;

        gallons = minivan.fuelNeeded(distance);

        System.out.println("To go " + distance + " miles, minivan need " +
                gallons + " gallons of fuel.");

        gallons = sportscar.fuelNeeded(distance);

        System.out.println("To go " + distance + " miles, sportscar need " +
                gallons + " gallons of fuel.");
    }
}

class Vehicle {
    int passengers;     // number of passengers
    int fuelcap;        // fuel capacity in gallons
    int mpg;            // fuel consumption in miles per gallon

    public Vehicle(int passengers,
                   int fuelcap,
                   int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }

    // Returns the range.
    int range() {
        return this.fuelcap * this.mpg;
    }

    // Compute fuel needed for a given distance.
    double fuelNeeded(int miles) {
        return (double) miles / this.mpg;
    }
}