public class Player{
  private final String name;
  private double hp;
  private double maxHP;
  private Room currentRoom;
  
  public Player(String name, double maxHP, Room startingRoom){
    this.name = name;
    this.maxHP = maxHP;
    this.hp = maxHP;
    this.currentRoom = startingRoom;
  }
  public void status(){
    System.out.print(name + " is ");
    if(hp < 25){
      System.out.println(BackColor.RED + "badly injured" +BackColor.RESET);
    }
    else if(hp < 50) {
      System.out.println(ForeColor.LIGHT_RED + "injured" + ForeColor.RESET);
    }
    else if(hp < 75){
      System.out.println(ForeColor.YELLOW + "lightly injured" + ForeColor.RESET);
    }
    else{
      System.out.println(ForeColor.LIGHT_GREEN + "healthy" + ForeColor.RESET);
    }
  }
  public Room getCurrentRoom(){
    return currentRoom;
  }
  public String getName(){
    return ForeColor.GREEN + this.name + ForeColor.RESET;
  }
}