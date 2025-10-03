import java.util.Scanner;

import schedule.Contact;
import schedule.HandleContact;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        HandleContact handleContact = new HandleContact();
        Boolean isProgram =  true;
        Integer option = -1;
        while (isProgram) {
            createMenu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("1. Agregar contacto inserte el nombre");
                    String name = scanner.next();
                    System.out.println("2. Email");
                    String email = scanner.next();
                    System.out.println("3.  Edad");
                    Integer age = scanner.nextInt();
                    Contact contact = new Contact(name, age, email);
                    handleContact.add(contact);
                break;
                case 2:
                    System.out.println("2. escriba el email");
                    String searchEmail = scanner.next();
                    Contact resultContact = handleContact.search(searchEmail);
                    if (resultContact != null) {
                        resultContact.print();
                    }
                break;
                case 3:
                    System.out.println("3. escriba el email");
                    String deleteEmail = scanner.next();
                    Boolean result = handleContact.remove(deleteEmail);
                    if (result) {
                        System.out.println("Contacto Eliminado");
                    }
                break;
                case 4:
                    handleContact.show();
                break;
                case 5:
                    scanner.close();
                    isProgram = false;
                break;
            }
        }
    }
    public static void createMenu() {
        System.out.println("1. Agregar contacto");
        System.out.println("2. Buscar Contacto");
        System.out.println("3. Eliminar Contacto");
        System.out.println("4. Mostrar Todos");
        System.out.println("5. Salir");
    }
}
