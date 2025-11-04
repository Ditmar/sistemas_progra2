package bank;
import java.time.LocalDateTime;

public class Transaction {
    private String code;
    private Double amount;
    private LocalDateTime date;
    private String type;
    public Transaction(Double amount, String type) {
        this.amount = amount;
        this.type = type;
        // generate data
        this.date = LocalDateTime.now();
        this.code = this.generateCode();
    }
    private String generateCode() {
        String dateString = LocalDateTime.now().toString();
        return dateString.substring(dateString.length() - 5);
    }
    public String getCode() {
        return this.code;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void print() {
        System.out.println("------------------------------------");
        System.out.println("" + this.code + " | " + this.amount + " | " + this.date.toString() + "|" + this.type + "|");
        System.out.println("------------------------------------");
    }
}