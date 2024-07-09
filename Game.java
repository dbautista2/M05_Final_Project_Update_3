import java.util.*;

public class Game {
    private Location currentLocation;
    private Player player;
    private String gameStatus;
    private List<Item> inventory;
    private Map<String, Command> commands;
    private int score;
    private long timeElapsed;
    private int level;
    private String difficulty;

    public Game() {
        this.gameStatus = "Not Started";
        this.inventory = new ArrayList<>();
        this.commands = new HashMap<>();
        this.score = 0;
        this.timeElapsed = 0;
        this.level = 1;
        this.difficulty = "Normal";
    }

    public void start() {
        // Start the game logic
        this.gameStatus = "In Progress";
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public Player getPlayer() {
        return player;
    }
}