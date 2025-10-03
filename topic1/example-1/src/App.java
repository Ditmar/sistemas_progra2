import utils.Table;
public class App {
    public static void main(String[] args) throws Exception {
        Table table1 = new Table("Negra", 100, 100);
        Table table2 = new Table("Blanca", 90, 140);
        Table table3 = new Table("Azul", 30, 30);
        System.out.println("Table 1 area = " + table1.getArea());
        System.out.println("Table 2 area = " + table2.getArea());
        System.out.println("Table 3 area = " + table3.getArea());
        Table.printMessage();
        
    }
}
