// Bank hesabı idarəedilməsi class-ı

public class BankAccount {

    public static class Account{

       private String accountHolder;
       private double balance;

       public String getAccountHolder() {
           return accountHolder;
       }

       public void setAccountHolder(String accountHolder) {
           this.accountHolder=accountHolder;
       }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
           if (balance<0) {
               System.out.println("Balans mənfi ola bilməz!");
           }
           else {
               this.balance=balance;
           }
       }

       public double deposit(double amount) {
           if (amount > 0) {
               balance += amount;
           }
           return balance;
       }

       public double withdraw(double amount) {
           if (balance < amount) {
               System.out.println("Kifayət qədər balans yoxdur!");
           }
           return balance - amount;
       }
    }

    public static void main(String[] args){
        Account account = new Account();
        account.setAccountHolder("Əsmər Məmmədli");
        account.setBalance(1000);

        System.out.println("Hesab sahibi: " + account.getAccountHolder());
        System.out.println("Balans: " + account.getBalance());

        account.deposit(500);
        System.out.println("500 əlavə edildikdən sonra balans: " + account.getBalance());


        account.withdraw(200);
        System.out.println("200 çıxıldıqdan sonra balans: " + account.getBalance());

        account.withdraw(5000);

        account.setBalance(-100);

    }
}
