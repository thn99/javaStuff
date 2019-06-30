package Aula03;

import java.util.ArrayList;
import java.util.List;

public class Department {
    String name, location;
    int code, phoneExtension;
    double budget;
    List<Employee> staff = new ArrayList<>();
    Employee chief;

    public Department(String name, String location, int code, int phoneExtension, double budget, Employee chief) {
        this.name = name;
        this.location = location;
        this.code = code;
        this.phoneExtension = phoneExtension;
        this.budget = budget;
        this.chief = chief;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPhoneExtension() {
        return phoneExtension;
    }

    public void setPhoneExtension(int phoneExtension) {
        this.phoneExtension = phoneExtension;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List<Employee> getStaff() {
        return staff;
    }

    public void setStaff(List<Employee> staff) {
        this.staff = staff;
    }

    void addEmployee(Employee e){
        this.staff.add(e);
    }

    void removeEmployee(Employee e){
        staff.remove(e);
    }

    public Employee getChief() {
        return chief;
    }

    public void setChief(Employee chief) {
        this.chief = chief;
    }

    void removeEmployee(int id){
        for(Employee employee : this.staff){
            if(employee.getId() == id){
                staff.remove(employee);
            }
        }
    }

    void listAllEmployees(){
        for (Employee e : this.staff) {
            System.out.println("Name: " + e.getName());
        }
        System.out.println("==========================");
    }

    int sizeOfEmployees(){
        return staff.size();
    }

    Employee getEmployee(long id){
        boolean aux = false;
        for(Employee e : staff){
            if(e.getId() == id){
                aux = true;
                e.printState();
            }
        }
        if(aux == false){
            System.out.println("Employee not found!");
        }
        System.out.println("==========================");
        return null;
    }

}
