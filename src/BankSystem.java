import java.util.*;
abstract  class Bank{
    protected int balance;
    protected int pin;
    Bank(int bal,int p){
        balance = bal;
        pin = p;
    }
    abstract void withdraw(int balance,int pin);
    abstract void deposit(int balance);

    public void checkBalance(){
        System.out.println("Balance "+balance);
    }
}
class SBI extends Bank{

    SBI(int bal,int p){
        super(bal,p);
    }
    void deposit(int amnt){
        if(amnt > 0) {
            balance += amnt;
            System.out.println("SBI bank Deposit successfully");
        }
        else{
            System.out.println("Invalid Amount");
        }
    }
    void withdraw(int amnt,int p){
        if(pin == p) {
            if(amnt < balance) {
                balance -= amnt;
                System.out.println("SBI bank Withdraw Successfully");
            }
            else{
                System.out.println("Insufficient Balance");
            }
        }
        else{
            System.out.println("Incorrect pin");
        }
    }
}
class IOB extends Bank{
    IOB(int bal,int p){
        super(bal,p);
    }
    void deposit(int amnt){
        if(amnt > 0) {
            balance += amnt;
            System.out.println("IOB bank Deposit successfully");
        }
        else{
            System.out.println("Invalid Amount");
        }
    }
    void withdraw(int amnt,int p){
        if(pin == p){
            if(amnt < balance){
                balance -= amnt;
                System.out.println("IOb bank Withdraw Successfully");
            }
            else {
                System.out.println("Insufficient Balance");
            }
        }
        else{
            System.out.println("Incorrect Pin");
        }

    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Bank:");
        System.out.println("1. SBI");
        System.out.println("2. IOB");

        int choice = sc.nextInt();

        System.out.println("Set your PIN:");
        int pin = sc.nextInt();

        Bank bank;

        if (choice == 1) {
            bank = new SBI(500, pin);
        } else {
            bank = new IOB(500, pin);
        }

        while (true) {
            System.out.println("\n1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");

            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Enter amount:");
                    bank.deposit(sc.nextInt());
                    break;

                case 2:
                    System.out.println("Enter PIN:");
                    int p = sc.nextInt();
                    System.out.println("Enter amount:");
                    int amt = sc.nextInt();
                    bank.withdraw(amt, p);
                    break;

                case 3:
                    bank.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}