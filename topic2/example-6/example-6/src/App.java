import java.util.ArrayList;

import geo.Circle;
import geo.Shape;
import geo.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        Triangle triangle = new Triangle(23.4, 34.9);
        Circle circle = new Circle(56.4);
        ArrayList<Shape> listShapes = new ArrayList<>();
        listShapes.add(circle);
        listShapes.add(triangle);
        for (Shape item : listShapes) {
            item.area();
            item.printArea();
        }

    }
}
