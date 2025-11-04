package entities;

import java.util.ArrayList;
import java.util.Date;

public class Student extends Person {
    private String ru;
    private String password;
    private Date registerDate;
    private ArrayList<Carrier> carriers;

    public Student(String name, String lastName, String ci) {
        super(name, lastName, ci);
        carriers = new ArrayList<>();
    }
    public void addCarrier(Carrier carrier) {
        this.carriers.add(carrier);
    }
    public String getRu() {
        return ru;
    }
    public void setRu(String ru) {
        this.ru = ru;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Date getRegisterDate() {
        return registerDate;
    }
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
    public ArrayList<Carrier> getCarriers() {
        return carriers;
    }
    public void setCarriers(ArrayList<Carrier> carriers) {
        this.carriers = carriers;
    }
    
}
