package bank;

import java.util.ArrayList;

public class RegisterHandle {
    private ArrayList<Transaction> listTransaction;
    
    public RegisterHandle() {
        this.listTransaction = new ArrayList<>();
    }

    public void register(Transaction tx) {
        listTransaction.add(tx);
    }
    public void print() {
        for(Transaction item : this.listTransaction) {
            item.print();
        }
    }
    
}
