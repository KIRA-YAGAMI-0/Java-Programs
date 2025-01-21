import java.util.Scanner;

class BankAccount_2ndVersion{
    String accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount_2ndVersion(String accNum, String ach, double bal) {
        accountNumber = accNum;
        accountHolderName = ach;
        balance = bal;
    }

    public void displayAccountDetails() {
        // System.out.println("Sender Account Details:");
        System.out.println("Account Number:" + accountNumber);
        System.out.println("Account Holder:" + accountHolderName);
        System.out.println("Balance:" + balance);

    }

    public void deposit(double amount) {
        balance += amount;
        // System.out.println("The deposited amount +initial balance is:" + balance);
    }

    public void withdraw(double amount) {
        if (balance > 0 && balance >= amount) {
            balance -= amount;
            // System.out.println("The initial balance - withdraw amount  is:" + balance);
        } else {
            System.out.println("Insufficient Balance:" + balance);
        }
    }

}

class Transaction {
    public void transferFunds(BankAccount_2ndVersion sender, BankAccount_2ndVersion receiver, double amount) {
        if (sender.balance >= amount) {
            sender.withdraw(amount);
            receiver.deposit(amount);
            System.out.println("Transfering "+amount+" from " +sender.accountHolderName+ " to "+ receiver.accountHolderName+"...");
System.out.println("Transfer successful!");
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
    }
}

public class Bank_2ndVersion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("For sender:");
        System.out.print("Enter the account number:");
        String acc =sc.next();
        System.out.print("Enter the account holder name:");
        String acch=sc.next();
        System.out.print("Enter the initial balance:");
        double bl=sc.nextDouble();

        BankAccount_2ndVersion send = new BankAccount_2ndVersion(acc, acch,bl);
        System.out.println("For receiver:");
        System.out.print("Enter the account number:");
        String acc1 =sc.next();
        System.out.print("Enter the account holder name:");
        String acch1=sc.next();
        System.out.print("Enter the initial balance:");
        double bl1=sc.nextDouble();
        BankAccount_2ndVersion rec = new BankAccount_2ndVersion(acc1, acch1, bl1);

        System.out.println("Sender Account Details:");
        send.displayAccountDetails();

        System.out.println();

        System.out.println("Receiver Account Details:");
        rec.displayAccountDetails();

        System.out.println("Enter the amount you want to transfer:");
        double trana =sc.nextDouble();

        Transaction trans = new Transaction();
        trans.transferFunds(send, rec, trana);


        System.out.println("\nUpdated Sender Account Details:");
        send.displayAccountDetails();

        System.out.println("\nUpdated Receiver Account Details:");
        rec.displayAccountDetails();
        sc.close();
    }
}
