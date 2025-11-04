import shape.Circle;
import shape.Shape;
import shape.Square;
import shape.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        Triangle triangle = new Triangle(34.4, 45.3);
        Circle circle =new Circle(4.5);
        Square square = new Square(34.5, 43.43);
        
        printAreas(triangle);
        printAreas(circle);
        printAreas(square);
        
    }

    public static void printAreas(Shape shape) {
        shape.area();
        shape.print();   
    }
}
