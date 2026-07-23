package WeeklyAssignments1;

class BankAccount {
    final String ACCOUNT_TYPE = "Savings";

    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    
    void displayAccountDetails() {
        System.out.println("Account Details");
        System.out.println("---------------");
        System.out.println("Account Type : " + ACCOUNT_TYPE);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance : " + balance);
    }
}

public class Program_2 {
	 public static void main(String[] args) {

	 BankAccount b1 = new BankAccount(123456789, "Rohan Sharma", 85000.0);

     b1.displayAccountDetails();

     
     // b1.ACCOUNT_TYPE = "Current";
 }
}