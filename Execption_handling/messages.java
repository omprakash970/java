public class messages {
    public static void main(String[] args) {
        try{
            throw new ArithmeticException("Division by zero is not allowed"); 
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString()); 
            System.out.println(e.printStackTrace();)
        }
        
    }
    
}
