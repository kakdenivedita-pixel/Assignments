package WeeklyAssignments1;

class Employee {
    int empId;
    String name;
    double salary;

    static String companyName = "ABC Technologies";

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    static void displayCompany() {
        System.out.println("Company Name : " + companyName);
    }

    void displayEmployee() {
        System.out.println("\nEmployee ID : " + empId);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
    
    
}   

public class Program_employeemanagement_usingthisandstatic {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Priya", 50000);
        Employee e2 = new Employee(102, "Rahul", 62000);
        Employee e3 = new Employee(103, "Anjali", 58000);

        Employee.displayCompany();

        e1.displayEmployee();
        e2.displayEmployee();
        e3.displayEmployee();
    }
}
