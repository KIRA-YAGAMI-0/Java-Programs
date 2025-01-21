import java.util.Scanner;

class BankAccount_FinalVersion {
    String accountNumber;
    String accountHolderName;
    double balance;
    double time;
    double rt;
    double intt;
    Scanner sc = new Scanner(System.in);

    public BankAccount_FinalVersion(String accNum, String ach, double bal) {
        accountNumber = accNum;
        accountHolderName = ach;
        balance = bal;
    }

    public void displayAccountDetails() {
        System.out.println("Account Details:");
        System.out.println("Account Number:" + accountNumber);
        System.out.println("Account Holder's Name:" + accountHolderName);
        System.out.println("Balance:" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance:");
        }
    }

    public boolean isValidAccount() {
        if (balance >= 0) {
            System.out.println("Your Account is valid");
            return true;

        } else {
            System.out.println("Duh! Balance can't be negative : Invalid account!");
            return false;
        }
    }

    public void transferBalance(BankAccount_FinalVersion receiver, double amount) {
        receiver.deposit(amount);
        balance -= amount;
    }

    public boolean compareAccount(BankAccount_FinalVersion otherAccount) {
        if (balance == otherAccount.balance) {
            System.out.println("The account balance  is equal:");
            return true;
        } else {
            System.out.println("Sorry the account balance is not equal to the other account:");
        }
        return false;

    }

    double calculateInterest(double rate) {
        rt = rate;
        System.out.println("Please Enter the time in (years):");
        double yrs = sc.nextDouble();
        time = yrs;
        double Interest = (balance * yrs * rate) / 100;
        System.out.println("The interest of principle " + balance + " for time of " + yrs + " yrs and rate of " + rate  + "% is:" + Interest);
        intt = Interest;
        return Interest;

    }

    void applyInterest(double rate) {
        
        if (rt == rate) {
            if (time >= time) {
                balance += intt;
                System.out.println("Interest applied:" + intt);
                System.out.println("New Balance:" + balance);
            }
        }
    }

    void updateAccountDetails(String newAccountNumber, String newAccountHolderName) {
        accountNumber = newAccountNumber;
        accountHolderName = newAccountHolderName;
    }

    String getAccountSummary() {
        // System.out.print("Account Number:");

        return "Account Number:" + accountNumber + "\n" + "Account Holder Name:" + accountHolderName + "\n" + "Balance:"
                + balance;

    }

}

class Transaction {
    void transferFunds(BankAccount_FinalVersion sender, BankAccount_FinalVersion receiver, double amount) {
        if (sender.balance > 0 && sender.balance >= amount) {

            sender.withdraw(amount);
            receiver.deposit(amount);
            System.out.println("Transfering " + amount + " from " + sender.accountHolderName + " to "
                    + receiver.accountHolderName + " ....");
            System.out.println("Successfully transfered the amount of " + amount);
        }

    }

    boolean validateTransfer(BankAccount_FinalVersion sender, BankAccount_FinalVersion receiver,
            double amount) {
        if (sender.balance > 0 && sender.balance >= amount) {
            System.out.println("The transfer is valid:");
            return true;
        } else {
            System.out.println("The transfer is invalid:");
            return false;
        }
    }

    void displayTransactionSummary(BankAccount_FinalVersion sender, BankAccount_FinalVersion receiver, double amount) {
        System.out.println("Transaction Summary:");
        System.out.println("Sender's Account Number:" + sender.accountNumber);
        System.out.println("Sender's Name:" + sender.accountHolderName);
        System.out.println("Amount Transfered by sender:" + amount);
        System.out.println();
        System.out.println("Receiver's Account Number:" + receiver.accountNumber);
        System.out.println("Receiver's Name:" + receiver.accountHolderName);
        System.out.println("Amount Received by receiver:" + amount);

    }

    boolean isSufficientFunds(BankAccount_FinalVersion sender, double amount) {
        if (sender.balance > 0 && sender.balance >= amount) {
            System.out.println("The funds are sufficient:");
            return true;
        } else {
            System.out.println("The funds are insufficient:");
            return false;
        }
    }

    void cancelTransfer(BankAccount_FinalVersion sender, BankAccount_FinalVersion receiver, double amount) {
        System.out.println("The transfer is cancelled:");
        System.out.println("The amount of " + amount + " is transfered back to " + sender.accountHolderName);
        sender.deposit(amount);
        receiver.withdraw(amount);
        System.out.println("The transfer is cancelled successfully:");
    }

    void notifyTransferCompletion(BankAccount_FinalVersion sender, BankAccount_FinalVersion receiver,
            double amount) {
        System.out.println("The transfer is completed successfully:");
        System.out.println("The amount of " + amount + " is transfered from " + sender.accountHolderName + " to "
                + receiver.accountHolderName);

    }

    void applyTransactionFee(BankAccount_FinalVersion sender, double fee) {
        if (sender.balance > 10000.00) {
            
            sender.balance -= fee;
            System.out.println("The Transaction Fees of "+fee+"$ is deducted from your Account:");
        }
        if (!(sender.balance > 10000.00)) {
            
            System.out.println("The Transaction Fees of "+fee+"$ has been deducted from your Account:");

        }

    }

boolean validateTransactionAmount(double amount){
    if(amount>0){
        System.out.println("The transaction amount is valid:");
        return true;
    }else{
        System.out.println("The transaction amount is invalid:");
        return false;}
}

    void deductServiceCharge(BankAccount_FinalVersion sender, double serviceCharge) {
        if (sender.balance > 10000.00) {
            serviceCharge = 5.00;
            sender.balance -= serviceCharge;
            System.out.println("The Service Charge of 5$ is deducted from your Account:");
        }
        if (!(sender.balance > 10000.00)) {
            serviceCharge = 20.00;
            System.out.println("The Service Charge of 20$ has been deducted from your Account:");

        }
    }

    void reverseTransaction(BankAccount_FinalVersion sender, BankAccount_FinalVersion receiver,
            double amount) {
        System.out.println("The transaction is being reversed ....");
        sender.deposit(amount);
        receiver.withdraw(amount);
        System.out.println("The transaction is reversed successfully ^_^");

    }

}

public class Final_BankProject {
    public static void main(String[] args) {
        BankAccount_FinalVersion Alice = new BankAccount_FinalVersion("123456", "Alice", 5000);
        BankAccount_FinalVersion Bob = new BankAccount_FinalVersion("789101", "Bob", 5000);
        Transaction tra = new Transaction();
        System.out.println("Sender's Account Details:");
        Alice.displayAccountDetails();
        System.out.println("Receiver's Account Details:");
        Bob.displayAccountDetails();

        Alice.deposit(2000);
        Bob.withdraw(2000);

        tra.transferFunds(Alice, Bob, 2000);
        Alice.calculateInterest(10);
        Alice.applyInterest(10);
        // Alice.displayAccountDetails();

        tra.validateTransfer(Alice, Bob, 6000);
        tra.cancelTransfer(Alice, Bob, 6000);

        Alice.isValidAccount();

        Alice.getAccountSummary();

        Bob.getAccountSummary();
        
        tra.applyTransactionFee(Bob, 20);
        // tra.transferFunds(Alice, Bob, 6000);
        // sender.calculateInterest(5.2);
        

    }
}
