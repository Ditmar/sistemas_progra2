package bank;

public class Account {
    private Double balance;
    public Account(Double balance) {
        this.balance = balance;
    }
    public void addBalance(Double amount) {
        this.balance += amount;
    }
    public Boolean extractBalance(Double amount) {
        if (this.balance > amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
    public void showBalance() {
        System.out.println("---------------------");
        System.out.println("| " + this.balance + " bs.");
        System.out.println("---------------------");
    }
    public Double getBalance() {
        return this.balance;
    }
}
