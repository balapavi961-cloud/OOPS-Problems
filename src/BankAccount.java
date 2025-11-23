public class BankAccount {
   private long accountnumber = 8561000100018651L;
   private double balance=5000;
    double depoamount=1000;
    double withdramount=2000;

   public void deposite(){
       balance = balance+depoamount;
       System.out.println("Your deposite amount is :"+depoamount);
   }
   public void withDraw()
   {
       System.out.println("Withdrawn Amount :"+withdramount);
   }
   public void getBalance(){
       System.out.println("Your Account Balance Amount : "+(balance-withdramount));
   }
    public static void main(String[] args) {

        BankAccount bk = new BankAccount();
        bk.deposite();
        bk.withDraw();
    }
}
