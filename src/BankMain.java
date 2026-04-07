import java.util.*;
class BankAccount{
    private int pin;
    private int balance;

    BankAccount(int num, int bal){
        pin = num;
        balance = bal;
    }
    public  int getBalance(){
        return balance;
    }
    public void deposit(int amnt,int p){
        if(pin == p){
            balance += amnt;
        }
        else{
            System.out.println("Incorrect Pin");
        }
    }

    public void withdraw(int amnt,int p){
        if((pin == p)){
            if(amnt <= balance) {
                balance -= amnt;
                System.out.println("Withdraw amount :" + amnt);
            }else{
                System.out.println("Insufficient Balance");
            }
        }
        else{
            System.out.println("Incorrect Pin");
        }
    }

    public void checkBalance(){
        System.out.println(getBalance());
    }
}

public class BankMain {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount b1 = new BankAccount(12345,5000);
        b1.deposit(1000,12345);
        b1.withdraw(6000,12345);
        b1.checkBalance();
    }
}
