package OOP.Problems_on_oop;
class BankAccount{
    private int balance;
    BankAccount(int balance){
        this.balance=balance;
    }
    public void deposit(int amount){
       
        balance+=amount;
    }
    public void withdraw(int amount){
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }else{
            balance-=amount;
        }
    }
    public int getBalance(){
        return balance;
    }
    

}


public class problem4 {
    public static void main(String[] args){
        BankAccount account= new BankAccount(1000);
        account.deposit(500);
        System.out.println("Balance after deposit: "+account.getBalance());
        account.withdraw(200);
        System.out.println("Balance after withdrawal: "+account.getBalance());
    }
  

    
}
