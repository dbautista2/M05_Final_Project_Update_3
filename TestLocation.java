public class TestLocation {
    public static void main(String[] args) {
        Location location = new Location("Forest", "A dark and spooky forest.");
        System.out.println("Location name: " + location.getName());
        System.out.println("Location description: " + location.getDescription());
    }
}
