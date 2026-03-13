package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChampionshipManager {
    private static ChampionshipManager instance;
    private static int totalDrivers = 5;
    private static int totalRaces = 3;

    private List<Driver> drivers;
    private List <RallyRaceResult> races;
    private int driverIndex = 0;
    private int raceIndex = 0;
    

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

    /**
     * Metodi kattoo eka jos kuski on jo olemassa, ja sen jälkeen onko listalla tilaa, jos kaikki natsaa ni lisätään listaan
     * @param driver Se äijä ketä laitetaan listoille
     */
    public void registerDriver(Driver driver) {
        if (Arrays.asList(drivers).contains(driver)) {
            System.out.println("Driver: " + driver.getName() + " already registered.");
            return;
        }

        if (drivers.size() > driverIndex) {
            drivers.add(driver);
            driverIndex++;
            System.out.println("Driver: " + driver.getName() + " registered.");
        } else {
            System.out.println("Driver registery full.");
        }
    }

    public void addRaceResult(RallyRaceResult result) {
        if (races.size() > raceIndex) {
            races.add(result);
        } else {
            System.out.println("All races held");
        }
    }

    // TÄMÄ PALAUTTAA CHAMPIONship TILANTEEN
    public List<Driver> getDriverStandings() {
        return drivers;
    }

    // TÄMÄ PALAUTTAA KAIKKI JAETUT PISTEET
    public static int getTotalChampionshipPoints() {
        int totalChampionshipPoints = 0;
        
        return 1;
    }

}
