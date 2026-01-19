public class Room{
  private String name;
  private String description;
  private boolean unlocked;
  private boolean hasBeenEntered;
  private String firstEnterMessage;
  
  public Room(String name, String description, boolean unlocked, String firstEnterMessage){
    this.name = name;
    this.description = description;
    this.unlocked = unlocked;
    hasBeenEntered = false;
    this.firstEnterMessage = firstEnterMessage;
  }
  
  public String getName(){
    return name;
  }
  public void describe(){
    System.out.println("Du befindest dich in: " + name);
    System.out.println(description);
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