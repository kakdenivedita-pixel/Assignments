package WeeklyAssignments;


public class Student extends Person {

    int marks;

    
    Student(String name, int age, int marks1) {
    	super(name, age);   
        marks = marks1;
       
    	
   	}

    
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }
}