package main;

import java.util.List;

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
        Driver kalleRovanpera = new Driver("Kalle Rovanperä", "Finland", carKalleRovanpera);
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

        System.out.println("\n=== Test for: too many registrations, duplicate registeration & duplicate instance of championship manager");
        Driver extraDriver = new Driver("Adrien Fourmaux", "France", carAdrienFourmaux);
        championshipManager.registerDriver(extraDriver);
        championshipManager.registerDriver(kalleRovanpera);
        ChampionshipManager championshipManager2 = ChampionshipManager.getInstance();

        System.out.println("\n=== RACE 1 ===");
        RaceResult race1 = new RallyRaceResult("Jyväskylä", "Finland");
        race1.recordResult(kalleRovanpera, 1, 40);
        race1.recordResult(thierryNeuville, 2, 30);
        race1.recordResult(elfynEvans, 3, 20);
        race1.recordResult(ottTanak, 4, 10);
        race1.recordResult(adrienFourmaux, 5, 0);
        championshipManager.addRaceResult(race1);
       // List<Driver> race1Results = race1.getResults();

    //    // TÄMÄ ON TOIMIVAMPI RATKASU
    //     for (int i = 0; i < 5; i++) {
    //         System.out.println(race1.getDriverPoints(kalleRovanpera));
    //     }

                RaceResult race2 = new RallyRaceResult("Jyväskylä", "Finland");
        race2.recordResult(kalleRovanpera, 1, 40);
        race2.recordResult(thierryNeuville, 2, 30);
        race2.recordResult(elfynEvans, 3, 20);
        race2.recordResult(ottTanak, 4, 10);
        race2.recordResult(adrienFourmaux, 5, 0);
        championshipManager.addRaceResult(race2);
       // List<Driver> race1Results = race1.getResults();

        List<Driver> standings = championshipManager.getDriverStandings();
        for (Driver d : standings) {
            System.out.println(d.getName() + " " + d.getPoints());
        }


        }

    }





