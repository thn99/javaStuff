package Aula03;

import java.util.List;

public class Department {
    String name, location;
    int code, phoneExtension;
    double budget;
    List<Employee> staff;

    public Department(String name, String location, int code, int phoneExtension, double budget) {
        this.name = name;
        this.location = location;
        this.code = code;
        this.phoneExtension = phoneExtension;
        this.budget = budget;
    }

    public Department(String name, String location, int code, int phoneExtension, double budget, List<Employee> staff) {
        this.name = name;
        this.location = location;
        this.code = code;
        this.phoneExtension = phoneExtension;
        this.budget = budget;
        this.staff = staff;
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
        this.setStaff(staff);
    }
    void listAllEmployees(){
        for (Employee e : this.staff) {
            System.out.println(e);
        }
    }

}