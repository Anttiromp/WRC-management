package main;




public class ChampionshipManager {
    private static ChampionshipManager instance;
    private static int totalDrivers = 5;
    private static int totalRaces = 3;

    private Driver[] drivers;
    private RallyRaceResult[] races;
    

    private ChampionshipManager() {
        this.drivers = new Driver[totalDrivers];
        this.races = new RallyRaceResult[totalRaces];
    }

    public static ChampionshipManager getInstance() {
        if (instance == null) {
            new ChampionshipManager();
        } 
        return instance;

    }


    public static int getTotalChampionshipPoints() {
        // Täällä vaan haetaan for race : races -> rallyraceresults.getpoints
        // Varmasti voidaan avaimella hakee ne kaikki tähän?
        // Sit vaan järjestellään
        return 1;
    }

}
