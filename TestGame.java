public class TestGame {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
        System.out.println("Game status: " + game.getCurrentLocation());
    }
}
