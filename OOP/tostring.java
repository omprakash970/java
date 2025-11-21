package OOP;
class Geeks{
    String name; 
    String age; 
    Geeks(String name, String age){
        this.name = name; 
        this.age = age; 
    }
}
public class tostring {
    public static void main(String[] args){
        Geeks g = new Geeks("Oppie", "20");
        System.out.println(g.toString());
    }
    
}
