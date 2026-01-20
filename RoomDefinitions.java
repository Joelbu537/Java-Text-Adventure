import java.util.ArrayList;

public class RoomDefinitions {
    private RoomDefinitions() {}

    public static Room starter_field = new Room("Field", "The grass grows tall, and stretches as far as you can see." +
            "\nIYou can see a brightly lit " + ForeColor.WHITE + "Tavern" + ForeColor.RESET + " in the distance.", true, null);
    public static Room tavern = new Room("Tavern", "It is very noisy in here.", true, "The barkeeper slides you a note.", ItemDefinitions.corn);
}
