package main;


public class Main  {
    public static void main( String[] args ) {
        
        ChampionshipManager championshipManager = ChampionshipManager.getInstance();
        // Create cars for the drivers
        // Jos kaikki autot on vaan gravelia niin miten demotaan laskuri?
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
       
        // Register drivers
        championshipManager.registerDriver(kalleRovanpera);
        championshipManager.registerDriver(thierryNeuville);
        championshipManager.registerDriver(elfynEvans);
        championshipManager.registerDriver(ottTanak);
        championshipManager.registerDriver(adrienFourmaux);

        // Test for: Driver capasity & duplicate driver registry
        Driver adrien2Fourmaux = new Driver("Adrien Fourmaux", "France", carAdrienFourmaux);
        championshipManager.registerDriver(adrien2Fourmaux);
        championshipManager.registerDriver(kalleRovanpera);
    }
}

