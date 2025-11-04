import bank.LimitAccount;

public class App {
    public static void main(String[] args) throws Exception {
        LimitAccount account = new LimitAccount(5000.00);
        System.out.println("add Balance ");
        account.addBalance(4555.44);
        System.out.println("add Balance ");
        account.addBalance(1555.44);
        System.out.println("withdraw balance");
        account.extractBalance(4000.00);
        account.printLogTransaction();

        
    }
}
