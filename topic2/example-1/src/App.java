import entities.Person;
import entities.Professor;
import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Mario", "Castanieda", "143434234");
        Student student = new Student("Mario", "Castanieda", "143434234");
        student.setAge(23);
        Professor professor = new Professor(null, null, null);
        professor.getCi();
        
    }
}
