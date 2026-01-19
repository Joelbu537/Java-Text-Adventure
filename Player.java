public class Player{
  private String name;
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
    System.out.print(name + " ist ");
    if(hp < 25){
      System.out.println(" stark verletzt");
    }
    else if(hp < 50) {
      System.out.println(" verletzt");
    }
    else if(hp < 75){
      System.out.println(" leicht verletzt");
    }
    else{
      System.out.println(" gesund");
    }
  }
  public Room getCurrentRoom(){
    return currentRoom;
  }
  public String getName(){
    return ForeColor.GREEN + this.name + ForeColor.RESET;
  }
}