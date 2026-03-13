package main;




public class ChampionshipManager {
    private static ChampionshipManager instance;
    private static int totalDrivers = 5;
    private static int totalRaces = 3;

    private Driver[] drivers;
    private RallyRaceResult[] races;
    private int driverIndex = 0;
    private int raceIndex = 0;
    

    private ChampionshipManager() {
        this.drivers = new Driver[totalDrivers];
        this.races = new RallyRaceResult[totalRaces];
    }

    public static ChampionshipManager getInstance() {
        if (instance == null) {
            instance = new ChampionshipManager();
        } 
        return instance;
    }

    // TODO: check if driver already exists
    public void registerDriver(Driver driver) {
        if (drivers.length > driverIndex) {
            drivers[driverIndex] = driver;
            driverIndex++;
            System.out.println("Driver registered");
        } else {
            System.out.println("Driver registery full.");
        }
    }

    public void addRaceResult(RallyRaceResult result) {
        if (races.length > raceIndex) {
            races[raceIndex] = result;
        } else {
            System.out.println("All races held");
        }
    }

    public Driver[] getDriverStandings() {
        return drivers;
    }


    public static int getTotalChampionshipPoints() {
        // Täällä vaan haetaan for race : races -> rallyraceresults.getpoints
        // Varmasti voidaan avaimella hakee ne kaikki tähän?
        // Sit vaan järjestellään
        return 1;
    }

}
