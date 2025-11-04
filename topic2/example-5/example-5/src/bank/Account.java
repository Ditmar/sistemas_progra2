package bank;

public class Account {
    private Double balance;
    private RegisterHandle transactionRegister;
    public Account(Double balance) {
        this.balance = balance;
        this.transactionRegister = new RegisterHandle();
    }
    public void addBalance(Double amount) {
        this.balance += amount;
        Transaction transaction = new Transaction(amount, "+");
        this.transactionRegister.register(transaction);
    }
    public Boolean extractBalance(Double amount) {
        if (this.balance > amount) {
            this.balance -= amount;
            Transaction transaction = new Transaction(amount, "-");
            this.transactionRegister.register(transaction);
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
    public void printLogTransaction() {
        transactionRegister.print();
    }
}
