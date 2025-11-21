class Oppie<String>{
    String name; 
  Oppie(String name){
    this.name= name; 
  }
  String getName(){
    return name; 
  }
}
public class genericclass{
  public static void main(String[] args){
    Oppie<String> b1 = new Oppie("Nancy"); 

  }
}