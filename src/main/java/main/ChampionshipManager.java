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

    /** Registers a driver to the championship.
 * The driver will be added to the list of participants if:
 * - the maximum number of drivers has not been reached
 * - the driver has not already been registered.
 * @param driver the driver to register
 * @return true if the driver was successfully registered, false otherwise
 */
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


    /** Adds the result of a completed rally race to the championship.
 * The race result will be stored if the maximum number of races has not been exceeded.
 * @param raceResult the race result to add
 * @return true if the race result was successfully added, false otherwise
 */
    public void addRaceResult(RaceResult result) {
        if (races.size() < maxRaces) {
            races.add(result);
        } else {
            System.out.println("All races held");
        }
    }


    /** Returns the current championship standings.
 * Drivers are sorted in descending order based on their total points.
 * @return a list of drivers ordered by championship points
 */
    public List<Driver> getDriverStandings() {
        List<Driver> driverStandings = drivers;
        driverStandings.sort((d1, d2) -> d2.getPoints() - d1.getPoints());
        return driverStandings;
    }


    /** Calculates the total number of championship points scored by all drivers combined.
 * @return the sum of all driver points in the championship
 */
    public static int getTotalChampionshipPoints() {
        int totalChampionshipPoints = 0;
        for (Driver driver : instance.drivers) {
            totalChampionshipPoints += driver.getPoints();
        }
        return totalChampionshipPoints;
    }

    public static Driver getLeadingDriver() {
        List<Driver> driverStandings = instance.getDriverStandings();
        return driverStandings.get(0);
    }

    public List<RaceResult> getRaces() {
    return races;
}

}
