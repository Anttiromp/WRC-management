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

    /**
     * Metodi kattoo eka jos kuski on jo olemassa, ja sen jälkeen onko listalla tilaa, jos kaikki natsaa ni lisätään listaan
     * @param driver Se äijä ketä laitetaan listoille
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


    public void addRaceResult(RaceResult result) {
        if (races.size() < maxRaces) {
            races.add(result);
        } else {
            System.out.println("All races held");
        }
    }

    // TÄMÄ PALAUTTAA CHAMPIONship TILANTEEN
    public List<Driver> getDriverStandings() {
        List<Driver> driverStandings = new ArrayList<>();
        // LOOppi mis haetaan kisatulokset
            // Sisänen looppi mis haetaan kuskin pisteet tästä kisasta
            // Lisää driverstandings listaan
        // Lopuks järjestellään kuskit suuruusjärjestykseen
        for (RaceResult result : races) {
            result.getResults(); // Tämä on lista kuskeja
        }
        return drivers;
    }

    // TÄMÄ PALAUTTAA KAIKKI JAETUT PISTEET
    public static int getTotalChampionshipPoints() {
        int totalChampionshipPoints = 0;
        
        return totalChampionshipPoints;
    }

}
