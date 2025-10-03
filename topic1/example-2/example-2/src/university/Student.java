package university;
// this is the student class

public class Student {
    // attributes 
    private String name;
    private String lastName;
    private String ci;
    private Integer age;
    private String address;
    private String phone;
    private String typeBlood;
    // constructor
    public Student(String name, String lastName, String ci) {
        this.name = name;
        this.lastName = lastName;
        this.ci = ci;
    }
    // methods
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getCi() {
        return ci;
    }
    public void setCi(String ci) {
        this.ci = ci;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getTypeBlood() {
        return typeBlood;
    }
    public void setTypeBlood(String typeBlood) {
        this.typeBlood = typeBlood;
    }
    public void printStudentInfo() {
        System.out.println("-----------------------------");
        System.out.println("Nombre: " + this.name);
        System.out.println("Apellidos: " + this.lastName);
        System.out.println("Ci: " + this.ci);
        System.out.println("Telefono: " + this.phone);
        System.out.println("-----------------------------");
    }
}
