import interfaces.Operator;
import operator.Plus;

public class App {
    public static void main(String[] args) throws Exception {
        Plus plus = new Plus();
        plus.add(20, 40);
        // ---------------------------------
        Operator operator = (a, b) -> a + b;
        operator.add(20, 40); 
    }
}
