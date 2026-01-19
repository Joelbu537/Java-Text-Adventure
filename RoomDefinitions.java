import java.util.ArrayList;

public class RoomDefinitions {
    private RoomDefinitions() {}

    public static Room starter_field = new Room("Feld", "Das Gras ist ungemäht, und ersteckt sich, soweit du sehen kannst." +
            "\nIn der Ferne leuchten die Fenster einer " + ForeColor.WHITE + "Taverne" + ForeColor.RESET + ".", true, null);
    public static Room tavern = new Room("Taverne", "Es ist sehr laut und unrhuig.", true, "Der Wirt schiebt dir einen Zettel zu.", ItemDefinitions.corn);
}
