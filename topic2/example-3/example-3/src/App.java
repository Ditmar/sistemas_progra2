import math.Math;
import math.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        Math math = new Math();
        Vector a = new Vector(3, 5);
        Vector b = new Vector(5, 6);
        Integer result = math.add(3, 4);
        Vector resultVector = math.add(a, b);
        math.print(result);
        math.print(resultVector);
    }
}
