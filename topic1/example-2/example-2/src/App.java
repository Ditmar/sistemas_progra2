import university.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Raul", "Ramirez", "4543223");
        student1.setPhone("76543212");
        Student student2 = new Student("Pablo", "Gomez", "343434");
        student2.setPhone("5545454");
        student1.printStudentInfo();
        student2.printStudentInfo();
    }
}
