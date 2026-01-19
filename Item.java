public class Item{
  String name;
  double weight;
  String description;
  
  public Item(String name, String description, double weight){
    this.name = name;
    this.description = description;
    this.weight = weight;
  }
  public String getName(){
    return name;
  }
  public void describe(){
    System.out.println("Du hältst " + name + " in deinen Händen.\n" + description + "\nGewicht: " + weight);
  }
}