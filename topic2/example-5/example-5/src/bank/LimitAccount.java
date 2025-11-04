package bank;

public class LimitAccount extends Account {
    private Double limit;
    public LimitAccount(Double balance) {
        super(balance);
        this.adjustLimit();
    }
    private void adjustLimit() {
        this.limit = this.getBalance() / 2;
    }

    @Override
    public void addBalance(Double amount) {
        super.addBalance(amount);
        this.adjustLimit();
    }
    
    @Override
    public Boolean extractBalance(Double amount) {
        Boolean isTransactionCorrect = false;
        if (this.limit > amount) {
            isTransactionCorrect = super.extractBalance(amount);
            this.adjustLimit();
        }
        return isTransactionCorrect;
    }
}
