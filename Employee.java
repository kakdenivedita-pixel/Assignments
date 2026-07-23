package WeeklyAssignments;

public class Employee {
	int id;
    String name;
    double basicSalary;

Employee(int id1, String name1, double basicSalary1){
	id = id1;
    name = name1;
    basicSalary = basicSalary1;
	
	
}

double calculateSalary() {
    return basicSalary + (0.20 * basicSalary) + (0.10 * basicSalary);
}

void display() {
    System.out.println("ID: " + id + ", Name: " + name + ", Basic Salary: " + basicSalary + ", Total Salary: " + calculateSalary());
}

}
