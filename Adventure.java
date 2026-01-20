import java.util.ArrayList;
import java.util.Scanner;

public class Adventure{
  public static Player p;
  public static void main(String[] args){
    System.out.println("Welcome to the " + ForeColor.LIGHT_GREEN + "Text-Adventure" + ForeColor.RESET + "!\n");
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your " + ForeColor.WHITE + "name" + ForeColor.RESET + ":"  + ForeColor.GREEN);
    String playerName = sc.nextLine();
    if(playerName.isEmpty()) playerName = "Player";
    System.out.print(ForeColor.RESET);

    p = new Player(playerName, 100, RoomDefinitions.starter_field);
    p.getCurrentRoom().describe();
    
    
    while (true) {
      System.out.print("> ");
      if(sc.hasNext()) sc.nextLine();
      String rawInput = sc.nextLine();
      
      if(rawInput.isEmpty()) continue;
      String[] input = rawInput.split(" ");
      Console.clear();
      
      switch (input[0]) {
        case  "status": 
          p.status();
          break;
        case "search":
          p.getCurrentRoom().search();
          break;
        case "inventory":
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
