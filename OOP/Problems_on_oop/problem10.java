package OOP.Problems_on_oop;
class book{
    String title; 
    String author; 
    int price; 

    book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayDetails(){
        System.out.println(author);
        System.out.println(title);
        System.out.println(price);

    }
}

public class problem10 {
    public static void main(String[] args){
        book b = new book("Java Programming", "John Doe", 500);
        b.displayDetails();
    }
    
}
