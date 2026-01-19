import java.util.Scanner;

public class Adventure{
  public static void main(String[] args){
    System.out.println("\u001B[31mWilkommen zum " + Color.GREEN + "Text-Adventure!\n\n" + Color.RESET);
    System.out.print("Gib deinen Namen ein: ");
    Scanner sc = new Scanner(System.in);
    
    Room tavern = new Room("Taverne", "Es ist sehr laut und unrhuig.", true, null);
    Player p = new Player(sc.next(), 100, tavern);
    p.getCurrentRoom().describe();
    
    
    while (true) { // Gameplay-Loop 
      System.out.print("> ");
      if(sc.hasNext()) sc.nextLine();
      String rawInput = sc.nextLine();
      
      if(rawInput.length() == 0) continue;
      String[] input = rawInput.split(" ");
      
      switch (input[0]) {
        case  "status": 
          p.status();
          break;
        case "use": 
          
          break;
        default: 
          
      } // end of switch
    }
  }
}