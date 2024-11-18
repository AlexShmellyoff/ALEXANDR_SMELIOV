package homework_nr_6;

public class BankAccount {

    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double deposit(double amount){
        return balance + amount;
    }

    public double withdraw(double amount){
        if (balance > amount) {
            return balance - amount;
        }
        System.out.println("Your balance is too low");
        return balance;

    }



    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("1234", 35);


        System.out.println(bankAccount.deposit(12));
        System.out.println(bankAccount.withdraw(7));
        System.out.println(bankAccount.withdraw(40));

    }
}
