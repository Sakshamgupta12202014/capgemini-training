import java.util.Scanner;

class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdraw(double amount) {
        this.balance -=amount;
    }   

    public String toString() {
        return "Updated balance of " + this.accountNumber + ": " + (int)this.balance;
    }
}

// Main class
public class OnlineBankingSystem {
    Account accounts[];
    int count;
    Scanner sc;

    OnlineBankingSystem(Account accounts[], Scanner sc, int count) {
        this.accounts = accounts;
        this.sc = sc;
        this.count = count;
    }   

    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);
        Account a1 = new Account(101, "a1", 5000);
        Account a2 = new Account(102, "a2", 5000);

        Account accounts[] = { a1, a2 };
        OnlineBankingSystem bank = new OnlineBankingSystem(accounts, sc, 2);

        try{
            bank.transferFunds();
        }catch(AccountNotFoundException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }catch(IllegalArgumentException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }catch(InsufficientFundsException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }finally{
            System.out.println("Transaction ended.");
        }

    }

    private void transferFunds() throws IllegalArgumentException, AccountNotFoundException, InsufficientFundsException{
        System.out.print("Enter source account number: ");
        int sourceAccountNumber = sc.nextInt();

        System.out.print("Enter target account number: ");
        int targetAccountNumber = sc.nextInt();

        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();

        boolean isSourcePresent = false;
        boolean isTargetPresent = false;

        Account source = null, target = null;

        for(int i=0; i<count; i++) {
            if(accounts[i].getAccountNumber() == sourceAccountNumber) {
                source = accounts[i];
                isSourcePresent = true;
            }else if(accounts[i].getAccountNumber() == targetAccountNumber) {
                isTargetPresent = true;
                target = accounts[i];
            }
        }

        if(!isSourcePresent) {
            throw new AccountNotFoundException("Source Account " + sourceAccountNumber + " does not exist");
        }
        if(!isTargetPresent) {
            throw new AccountNotFoundException("Target Account " + targetAccountNumber + " does not exist");
        }

        // check whether amount is valid or not 
        if(amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative or zero");
        }

        // check if amount is available in source account
        if(amount > source.getBalance()) {
            throw new InsufficientFundsException("Insufficient funds in account " + sourceAccountNumber);
        }

        // withdraw from source account and deposit in target account

        source.withdraw(amount);
        target.deposit(amount);

        System.out.println("Transaction successful!");
        displayAccounts(source, target);
    }

    private void displayAccounts(Account source, Account target) {
        System.out.println(source);
        System.out.println(target);
    }
}



class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}