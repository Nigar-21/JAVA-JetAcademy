public class BankAccount {
    private double balance;
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Məbləğ müsbət olmalıdır");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Balansda kifayət qədər vəsait yoxdur");
        }
    }

    public void setBalance(double a){
        this.balance= a;
    }

    public double getBalance() {
        return balance;
    }
}
