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
       
        System.out.println("=== Register drivers ===");
        championshipManager.registerDriver(kalleRovanpera);
        championshipManager.registerDriver(thierryNeuville);
        championshipManager.registerDriver(elfynEvans);
        championshipManager.registerDriver(ottTanak);
        championshipManager.registerDriver(adrienFourmaux);

        System.out.println("\n=== Test for: too many registrations & duplicate registeration");
        Driver extraDriver = new Driver("Adrien Fourmaux", "France", carAdrienFourmaux);
        championshipManager.registerDriver(extraDriver);
        championshipManager.registerDriver(kalleRovanpera);

        System.out.println("=== RACE 1 ===");
        RallyRaceResult race1 = new RallyRaceResult("Jyväskylä", "Finland");
        race1.recordResult(kalleRovanpera, 1, 40);
        race1.recordResult(thierryNeuville, 2, 30);
        race1.recordResult(elfynEvans, 3, 20);
        race1.recordResult(ottTanak, 4, 10);
        race1.recordResult(adrienFourmaux, 5, 0);
    }
}

