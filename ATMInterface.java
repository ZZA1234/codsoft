import java.util.*;

public class ATMInterface
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("******ATM INTERFACE******");
        System.out.println("Enter your Initial Balance :");
        double bal=sc.nextDouble();

        BankAccount useracc = new BankAccount(bal);
        int choice;

        do
        {
            System.out.println("Select an Option :");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Your balance is Rs." + useracc.getbalance());
                    break;
                case 2:
                    System.out.print("Enter amount to be deposited: ");
                    double depositAmount = sc.nextDouble();
                    useracc.deposit(depositAmount);
                    System.out.println("Your balance now is Rs." + useracc.getbalance());
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    useracc.withdraw(withdrawAmount);
                    System.out.println("Your balance now is Rs." + useracc.getbalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }while(choice!=4);
    }
}

class BankAccount
{
    private double balance;

    public BankAccount(double bal)
    {
        this.balance=bal;
    }

    public double getbalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Successfully deposited Rs"+amount+" into your account");
    }

    public void withdraw(double amount)
    {
        if(amount>balance||balance<=0)
        {
            System.out.println("Insufficient balance.");
        }
        else
        {
            balance -= amount;
            System.out.println("Successfully withdrawn Rs."+amount+" from your account");
        }
    }
}