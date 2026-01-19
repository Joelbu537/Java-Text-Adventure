import java.util.ArrayList;
import java.util.Scanner;

public class Adventure{
  public static Player p;
  public static void main(String[] args){
    System.out.println("Wilkommen zum " + ForeColor.GREEN + "Text-Adventure" + ForeColor.RESET + "!\n");
    System.out.print("Gib deinen Namen ein: " + ForeColor.GREEN);
    Scanner sc = new Scanner(System.in);
    System.out.print(ForeColor.RESET);

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
        case "help":
          System.out.println("---------------[ HELP PAGE ]---------------");
          break;
        default:
          System.out.println(ForeColor.RED + "Unknown Command or Syntax Error!\nUse \"help\" to get a list of all possible commands!" + ForeColor.RESET);
      }
    }
  }
}
