package OOP;
// Step 1: Create Custom Exception
class InsufficientFundsException extends Exception {
}

// Step 2: Bank class using custom exception
class BankAccount {
    private double balance = 5000;

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            // Throwing custom exception
            throw new InsufficientFundsException();
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }
}

// Step 3: Test class
public class Main {
   public static void main(String[] args) {
        BankAccount b = new BankAccount();
        try {
            b.withdraw(7000); // More than balance → custom exception
        } catch (InsufficientFundsException e) {
            System.out.println("Error: Insufficient Funds!");
        }
    }
}
