package shape;

public class Circle implements Shape{

    private Double radio;
    private Double area;
    public Circle(Double radio) {
        this.radio = radio;
    }
    @Override
    public Double area() {
        this.area = Math.PI * this.radio * this.radio;
        return this.area;
    }

    @Override
    public void print() {
        System.out.println("El area del circle  es " + this.area);
    }
    
}
