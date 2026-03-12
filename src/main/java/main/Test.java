package main;

public class Test {
    public static void main(String[] args ) {
        System.out.println("== TEST1: CREATE A NEW DRIVER & CAR == ");
        RallyCar kalleCar = new GravelCar("Toyota", "Coupe", 420);
        Driver kalle = new Driver("Kalle Rovanperä", "Finland", kalleCar);
        System.out.println("Driver: " + kalle.getName());
        System.out.println("Car: " );

    }

}
