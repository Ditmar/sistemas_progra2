import java.util.ArrayList;
import java.util.List;

import employed.Employed;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Employed> employedList = new ArrayList<>();

        employedList.add(new Employed("Maria Gomez", 30, 5000));
        employedList.add(new Employed("Juan Perez", 45, 6500));
        employedList.add(new Employed("Ramon Mamani", 23, 2500));
        employedList.add(new Employed("Eliana Lopez", 35, 15000));
        
        employedList.stream().
        filter( employed -> employed.getAge() > 30).
        sorted(
            (employed1, employed2) -> employed2.getSalary() - employed1.getSalary()).
        map((employed) -> {
            Employed newEmployed = new Employed(employed.getName().toUpperCase(), employed.getAge(), employed.getSalary());
            return newEmployed;
        }).forEach((employed) -> employed.println());
        
    }
}
