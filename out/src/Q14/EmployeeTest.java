package Q14;

import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double basicSalary;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        System.out.print("Enter Employee Name: ");
        empName = sc.next();
        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    void displayGrossSalary() {
        double grossSalary = basicSalary + (0.2 * basicSalary) + (0.8 * basicSalary);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.inputDetails();
        emp.displayGrossSalary();
    }
}
