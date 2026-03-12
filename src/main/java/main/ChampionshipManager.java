package main;

import java.util.ArrayList;
import java.util.List;

public class ChampionshipManager {
    private List<Driver> drivers = new ArrayList<>();
    private List<RallyRaceResult> races = new ArrayList<>();
    private static int totalDrivers;
    private static int totalRaces;


    // Needs a constructor



    public void registerDriver(Driver driver) {
        drivers.add(driver);
    }

    public static int getTotalChampionshipPoints() {
        // Täällä vaan haetaan for race : races -> rallyraceresults.getpoints
        // Varmasti voidaan avaimella hakee ne kaikki tähän?
        // Sit vaan järjestellään
        return 1;
    }

}
