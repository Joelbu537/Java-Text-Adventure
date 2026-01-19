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
    List<Item> lootList = Arrays.asList(loot);
    if(!lootList.isEmpty()){
      inventory = new ArrayList<>(lootList); // WTF
    }
  }
  public void describe(){
    System.out.println("Du befindest dich in: " + name);
    System.out.println(description);
  }
  public void search(){
    System.out.println(Adventure.p.getName() + " durchsucht " + this.getName() + "...");
    if(inventory.isEmpty()){
      System.out.println(Adventure.p.getName() + " findet nichts");
      return;
    }
    System.out.println(Adventure.p.getName() + " findet:");
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