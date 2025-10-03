public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Escriba algo");
        Reader reader = new Reader();
        String input = reader.readLine();
        System.out.println(input);

    }
}
