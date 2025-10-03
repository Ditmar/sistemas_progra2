package utils;
public class Table {
    private String color;
    Integer width;
    Integer height;
    //constructor
    public Table(String color, Integer width, Integer height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }
    public Integer getArea(){
        return this.width * this.height;
    }
    public static void printMessage() {
        System.out.println("Hello world! from static method");
    }
}
