package main;


public class Main  {
    public static void main( String[] args ) {
        // Create cars for the drivers
        RallyCar carKalleRovanpera = new GravelCar("Toyota", "GR Yaris Rally1", 500);
        RallyCar carThierryNeuville = new GravelCar("Hyndai", "i20 N Rally1", 500);
        RallyCar carElfynEvans = new GravelCar("Toyota", "GR Yaris Rally1", 500);
        RallyCar carOttTanak = new GravelCar("Ford", "Puma Rally1", 500);
        RallyCar carAdrienFourmaux = new GravelCar("Ford", "Fiesta Rally2", 500);

        // Create drivers
        Driver kalleRovanpera = new Driver("Kalle Rovanperä", "Finlad", carKalleRovanpera);
        Driver thierryNeuville = new Driver("Thierry Neuville", "Belgium", carThierryNeuville);
        Driver elfynEvans = new Driver("Elfyn Evans", "United Kingdom", carElfynEvans);
        Driver ottTanak = new Driver("Ott Tänak", "Estonia", carOttTanak);
        Driver adrienFourmaux = new Driver("Adrien Fourmaux", "France", carAdrienFourmaux);

    }
}

