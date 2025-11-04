import bank.Account;
import bank.LimitAccount;

public class App {
    public static void main(String[] args) throws Exception {
        // Account account = new Account(5000.00);
        // account.showBalance();
        // account.addBalance(1000.0);
        // account.showBalance();
        // account.extractBalance(5000.0);
        // account.showBalance();
        LimitAccount limitAccount = new LimitAccount(10000.0);
        limitAccount.addBalance(100.0);
        limitAccount.showBalance();
        limitAccount.extractBalance(4000.0);
        limitAccount.showBalance();
        limitAccount.extractBalance(6000.0);
        limitAccount.showBalance();
    }
}
