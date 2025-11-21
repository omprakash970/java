package OOP;
// GOOD DESIGN: abstract method
// Custom Exception with message
class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String msg) {
        super(msg);  // pass message to Exception class
    }
}

class BankAccount {
    private double balance = 5000;

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal amount exceeds balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }
}

public class testt {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        try {
            b.withdraw(8000);
        } 
        catch (InsufficientFundsException e) {
            System.out.println("Custom Exception Caught:");
            System.out.println(e.getMessage());
        }
    }
}
