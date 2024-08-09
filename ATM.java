//Please run this code in Vs Code Editor

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Successfully deposited $" + amount + "    New Balance is $" + balance +".");
        }

        else
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount + "     New Balance is $" + balance + ".");
        }

        else
        {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

class ATM{
    private static final int ATM_PIN = 1234;
    private final BankAccount account;

    public ATM(BankAccount account)
    {
        this.account = account;
    }

    public void start()
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Welcome to the ATM");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int opt = scanner.nextInt();

            switch (opt) {
                case 1 :
                
                    System.out.print("Enter ATM PIN: ");
                    int pin = scanner.nextInt();
                    if (pin == ATM_PIN)
                    {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        account.withdraw(amount);
                    }

                    else
                    {
                        System.out.println("Invalid PIN.");
                    }
                
                case 2 : 
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                
                case 3 : 
                    System.out.print("Enter ATM PIN: ");
                    int pin = scanner.nextInt();
                    if (pin == ATM_PIN)
                    {
                        System.out.println("Current balance: $" + account.getBalance());
                    }

                    else
                    {
                        System.out.println("Invalid PIN.");
                    }
                
                case 4 : 
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                
                default : System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void main(String[] args)
    {
        BankAccount userAccount = new BankAccount(1000.0);  // Initial balance
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
