import java.util.ArrayList;
import java.util.Scanner;

public class Adventure{
  public static Player p;
  public static void main(String[] args){
    System.out.println("Wilkommen zum " + ForeColor.GREEN + "Text-Adventure" + ForeColor.RESET + "!\n");
    System.out.print("Gib deinen Namen ein: " + ForeColor.GREEN);
    Scanner sc = new Scanner(System.in);
    System.out.print(ForeColor.RESET);
    
    Room tavern = new Room("Taverne", "Es ist sehr laut und unrhuig.", true, "Der Wirt schiebt dir einen Zettel zu.", (Item) null);
    p = new Player(sc.next(), 100, RoomDefinitions.starter_field);
    p.getCurrentRoom().describe();
    
    
    while (true) { // Gameplay-Loop 
      System.out.print("> ");
      if(sc.hasNext()) sc.nextLine();
      String rawInput = sc.nextLine();
      
      if(rawInput.isEmpty()) continue;
      String[] input = rawInput.split(" ");
      
      switch (input[0]) {
        case  "status": 
          p.status();
          break;
        case "search":
          p.getCurrentRoom().search();
          break;
        case "use": 
          
          break;
        default: 
          
      } // end of switch
    }
  }
}
