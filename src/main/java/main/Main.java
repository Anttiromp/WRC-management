package main;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChampionshipManager manager = ChampionshipManager.getInstance();

        // Create cars
        RallyCar toyotaGravel = new GravelCar("Toyota", "GR Yaris Rally1", 380);
        RallyCar hyundaiGravel = new GravelCar("Hyundai", "i20 N Rally1", 375);
        RallyCar fordGravel = new GravelCar("Ford", "Puma Rally1", 370);
        RallyCar toyotaAsphalt = new AsphaltCar("Toyota", "GR Yaris Rally1", 380);
        RallyCar hyundaiAsphalt = new AsphaltCar("Hyundai", "i20 N Rally1", 375);

        // Create drivers
        Driver rovanpera = new Driver("Kalle Rovanperä", "Finland", toyotaGravel);
        Driver neuville = new Driver("Thierry Neuville", "Belgium", hyundaiAsphalt);
        Driver evans = new Driver("Elfyn Evans", "United Kingdom", toyotaAsphalt);
        Driver tanak = new Driver("Ott Tänak", "Estonia", hyundaiGravel);
        Driver fourmaux = new Driver("Adrien Fourmaux", "France", fordGravel);

        // Register drivers
        manager.registerDriver(rovanpera);
        manager.registerDriver(neuville);
        manager.registerDriver(evans);
        manager.registerDriver(tanak);
        manager.registerDriver(fourmaux);


        // Race 1: Rally Monte Carlo
        RallyRaceResult monteCarlo = new RallyRaceResult("Rally Monte Carlo", "Monaco");
        monteCarlo.recordResult(neuville, 1, 25);
        monteCarlo.recordResult(evans, 2, 18);
        monteCarlo.recordResult(rovanpera, 3, 15);
        monteCarlo.recordResult(tanak, 4, 12);
        monteCarlo.recordResult(fourmaux, 5, 10);

        manager.addRaceResult(monteCarlo);

        // Race 2: Rally Sweden
        RallyRaceResult sweden = new RallyRaceResult("Rally Sweden", "Sweden");
        sweden.recordResult(rovanpera, 1, 25);
        sweden.recordResult(tanak, 2, 18);
        sweden.recordResult(evans, 3, 15);
        sweden.recordResult(neuville, 4, 12);
        sweden.recordResult(fourmaux, 5, 10);

        manager.addRaceResult(sweden);

        // Race 3: Safari Rally Kenya
        RallyRaceResult kenya = new RallyRaceResult("Safari Rally Kenya", "Kenya");
        kenya.recordResult(tanak, 1, 25);
        kenya.recordResult(rovanpera, 2, 18);
        kenya.recordResult(fourmaux, 3, 15);
        kenya.recordResult(evans, 4, 12);
        kenya.recordResult(neuville, 5, 10);

        manager.addRaceResult(kenya);


        // Print race summaries
        System.out.println("=== RACE RESULTS ===");
        printRaceResult(monteCarlo);
        printRaceResult(sweden);
        printRaceResult(kenya);


        // Print championship standings
        System.out.println("\n=== CHAMPIONSHIP STANDINGS ===");
        List<Driver> standings = manager.getDriverStandings();
        for (int i = 0; i < standings.size(); i++) {
            Driver d = standings.get(i);
            System.out.println((i + 1) + ". " + d.getName() + " (" + d.getCountry() + ") - " + d.getPoints() + " pts");
        }

        // Print statistics
        System.out.println("\n=== CHAMPIONSHIP STATISTICS ===");
        System.out.println("Leading driver: " + manager.getLeadingDriver().getName());
        System.out.println("Total championship points: " + manager.getTotalChampionshipPoints());
        System.out.println("Average points per driver: "
                + ChampionshipStatistics.calculateAveragePointsPerDriver(standings));
        System.out.println("Most successful country: "
                + ChampionshipStatistics.findMostSuccessfullCountry(standings));


        System.out.println("Total races held: "
                + ChampionshipStatistics.getTotalRacesHeld(List.of(monteCarlo, sweden, kenya)));
    }

    private static void printRaceResult(RallyRaceResult race) {
        System.out.println("\n" + race.getRaceName() + " - " + race.getLocation());
        for (Driver driver : race.getResults()) {
            System.out.println(driver.getName() + " -> " + race.getDriverPoints(driver) + " pts");
        }
    }
}