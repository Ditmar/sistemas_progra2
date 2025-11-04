package entities;

import java.util.Date;

public class Person {
    private String ci;
    private Date date;
    private Integer age;
    private String name;
    private String lastName;
    private String address;
    private String email;
    private String phoneNumber;
    private String cellNumber;
    public Person(String name, String lastName, String ci) {
        this.ci = ci;
        this.name = name;
        this.lastName = lastName;
    }
    public String getCi() {
        return ci;
    }
    public void setCi(String ci) {
        this.ci = ci;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getCellNumber() {
        return cellNumber;
    }
    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }
    
}
