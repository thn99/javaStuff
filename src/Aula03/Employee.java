package Aula03;

public class Employee {
    String name, jobTitle;
    long id;
    double salary;
    Department deptInCharge;

    public Employee(String name, String jobTitle, long id, double salary, Department deptInCharge) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.deptInCharge = deptInCharge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDeptInCharge() {
        return deptInCharge;
    }

    public void setDeptInCharge(Department deptInCharge) {
        this.deptInCharge = deptInCharge;
    }

    void getAnnualSalary(){
        System.out.println(this.getSalary() * 12);
    }

    void printState() {
        System.out.println("ID: " + getId() + "\nName: " + getName() + "\nJob title: " + getJobTitle() + "\nSalary: " + getSalary()
         + "\nDepartment in charge: " + getDeptInCharge().getName());
    }
}
