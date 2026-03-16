package main;

import java.util.ArrayList;
import java.util.List;

public class ChampionshipManager {
    private static ChampionshipManager instance;
    private static int totalDrivers = 5;
    private static int totalRaces = 3;

    private int maxDrivers = 5;
    private int maxRaces = 3;
    private List<Driver> drivers;
    private List <RaceResult> races;
    

    private ChampionshipManager() {
        this.drivers = new ArrayList<>(totalDrivers);
        this.races = new ArrayList<>(totalRaces);
    }

    public static ChampionshipManager getInstance() {
        if (instance == null) {
            instance = new ChampionshipManager();
        } else {
            System.out.println("Cannot create two separate championship managers.");
        }
        return instance;
    }


    public void registerDriver(Driver driver) {
        if (drivers.contains(driver)) {
            System.out.println("Driver: " + driver.getName() + " already registered.");
            return;
        }

        if (drivers.size() < maxDrivers) {
            drivers.add(driver);
            System.out.println("Driver: " + driver.getName() + " registered.");
        } else {
            System.out.println("Driver registery full.");
        }
    }


    public void addRaceResult(RaceResult result) {
        if (races.size() < maxRaces) {
            races.add(result);
        } else {
            System.out.println("All races held");
        }
    }

    /**
     * Method copies current list into a new, and sorts drivers by their points
     * @return sorted driver list by points (descending order)
     */
    public List<Driver> getDriverStandings() {
        List<Driver> driverStandings = drivers;
        driverStandings.sort((d1, d2) -> d2.getPoints() - d1.getPoints());
        return driverStandings;
    }

    /**
     * Method creates an instance of championship manager, and then loops through drivers and adds the points to the total tally
     * @return all the points from championship
     */
    public static int getTotalChampionshipPoints() {
        int totalChampionshipPoints = 0;
        for (Driver driver : getInstance().drivers) {
            totalChampionshipPoints += driver.getPoints();
        }
        return totalChampionshipPoints;
    }

    public static Driver getLeadingDriver() {
        List<Driver> driverStandings = getInstance().getDriverStandings();
        return driverStandings.get(0);
    }

}
