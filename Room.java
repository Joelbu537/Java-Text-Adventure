import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Room{
  private String name;
  private String description;
  public List<Item> inventory = new ArrayList<>();
  private boolean unlocked;
  private boolean hasBeenEntered;
  private String firstEnterMessage;
  
  public Room(String name, String description, boolean unlocked, String firstEnterMessage, Item... loot){
    this.name = name;
    this.description = description;
    this.unlocked = unlocked;
    hasBeenEntered = false;
    this.firstEnterMessage = firstEnterMessage;

    // Array Shenanigans
    inventory = new ArrayList<>(Arrays.asList(loot));
  }
  public void describe(){
    System.out.println("You are here: " + getName());
    System.out.println(description);
  }
  public void search(){
    System.out.println(Adventure.p.getName() + " is searching " + this.getName() + "...");
    if(inventory.isEmpty()){
      System.out.println(Adventure.p.getName() + " does not find anything");
      return;
    }
    System.out.println(Adventure.p.getName() + " finds:");
      for (Item item : inventory) {
          System.out.println(item.name);
      }
  }
  public boolean getUnlocked() {
    return unlocked;
  }
  public boolean getHasBeenEntered(){
    return hasBeenEntered;
  }
  public void setHasBeenEntered(boolean hasBeenEntered){
    if(hasBeenEntered == false && firstEnterMessage != null){
      System.out.println(firstEnterMessage);
    }
    hasBeenEntered = true;
  }
  public String getName(){
    return ForeColor.WHITE + this.name + ForeColor.RESET;
  }
}