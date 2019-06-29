package Aula03;

public class Employee {
    String name, jobTitle;
    long id;
    double salary;

    public Employee(String name, String jobTitle, long id, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
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


    void getAnnualSalary(){
        System.out.println(this.getSalary() * 12);
    }
}
