package shape;

public class Square implements Shape{

    private Double width;
    private Double height;
    private Double area;

    public Square(Double with, Double height) {
        this.width = with;
        this.height = height;
    }

    @Override
    public Double area() {
        this.area = this.height * this.width;
        return this.area;
    }

    @Override
    public void print() {
        System.out.println("El area del cuadrado  es " + this.area);
    
    }
    
}
