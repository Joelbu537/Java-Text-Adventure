import java.util.ArrayList;
import java.util.List;

public class Room{
  private String name;
  private String description;
  public List<Item> inventory = new ArrayList<>();
  private boolean unlocked;
  private boolean hasBeenEntered;
  private String firstEnterMessage;
  
  public Room(String name, String description, boolean unlocked, String firstEnterMessage, List<Item> loot){
    this.name = name;
    this.description = description;
    this.unlocked = unlocked;
    hasBeenEntered = false;
    this.firstEnterMessage = firstEnterMessage;
    if(loot != null){
      inventory = loot;
    }
  }
  
  public String getName(){
    return name;
  }
  public void describe(){
    System.out.println("Du befindest dich in: " + name);
    System.out.println(description);
  }
  public void search(){
    System.out.println(Adventure.p.getName() + " durchsucht " + BackColor.WHITE + ForeColor.BLACK + this.name + BackColor.RESET + ForeColor.RESET + "...");
    if(inventory.isEmpty()){
      System.out.println(Adventure.p.getName() + " findet nichts");
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
}