import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;
double amt;
    public BankAccount(String ac, String ach, double b) {
        accountNumber = ac;
        accountHolderName = ach;
        balance = b;
    }

    public void deposite(double amount) {
        System.out.println("Deposite Amount: "+amount);
        amount +=balance;
        System.out.println("Updated Balance: "+amount);
        amt=amount;
    }

    public void withdraw(double amount) {
        System.out.println("Withdraw Amount: "+amount);
        amt -=amount;
        System.out.println("Updated Balance: "+amt);
    }

    public void displayAccountDetails() {
System.out.println("Account Details:");
System.out.println("Account Number: "+accountNumber);
System.out.println("Account Holder: "+accountHolderName);
System.out.println("Balance: "+amt);
    }

}

public class Bank_1stVersion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accnum = sc.next();

        System.out.print("Enter account holder name: ");
        String accholder = sc.next();

        System.out.print("Enter initial balance: ");
        double initbal = sc.nextDouble();
        System.out.println();
        System.out.println();
        
        BankAccount obj = new BankAccount(accnum, accholder,initbal);

        System.out.print("Please ! Enter the Deposite Amount: ");
        double deposite =sc.nextDouble();
        obj.deposite(deposite);
        System.out.println();

        System.out.print("Please ! Enter the withdraw Amount: ");
        double with =sc.nextDouble();
        obj.withdraw(with);
        System.out.println();

        obj.displayAccountDetails();
        System.out.println();
        sc.close();
    }
}