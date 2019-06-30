package Aula03;

public class Main {
    public static void main(String[] args) {
        Employee n1 = new Employee("Teste 1", "Dono", 1, 1323);
        Employee n2 = new Employee("Teste 2", "quase dono", 2, 11);
        Department dept = new Department("Empresa", "SP", 1, 22, 123);
        dept.addEmployee(n1);
        dept.addEmployee(n2);
        dept.listAllEmployees();
        dept.removeEmployee(n1);
        dept.listAllEmployees();

        dept.getEmployee(2);
    }
}
