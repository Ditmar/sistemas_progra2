package shape;

public class Triangle implements Shape{

    private Double width;
    private Double height;
    private Double area;

    public Triangle(Double with, Double height) {
        this.width = with;
        this.height = height;
    }
    @Override
    public Double area() {
        this.area =  this.width * this.height / 2;
        return this.area;
    }

    @Override
    public void print() {
        System.out.println("El area del Triangulo es " + this.area);
    }
    
}
