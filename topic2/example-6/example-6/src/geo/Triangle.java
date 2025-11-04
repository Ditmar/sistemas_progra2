package geo;

public class Triangle extends Shape{
    private Double base;
    private Double height;
    private Double area;
    public Triangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public Double area() {
        this.area =  this.base * this.height / 2;
        return area;
    }
    @Override
    public void printArea() {
        System.out.println("Area del triangulo es :" + this.area);
    }
    
}
