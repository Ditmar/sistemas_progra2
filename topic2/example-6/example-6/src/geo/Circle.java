package geo;

public class Circle extends Shape {
    private Double radio;
    private Double area;
    public Circle(Double radio) {
        this.radio = radio;
    }
    @Override
    public Double area() {
        this.area =  Math.PI * this.radio * this.radio;
        return area;
    }
    @Override
    public void printArea() {
        System.out.println("Area del circulo es :" + this.area);
    }
}
