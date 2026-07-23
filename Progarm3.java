package WeeklyAssignments1;

class Vehicle{
	
	
	String brand;
	int year;


Vehicle(int year,String brand)
{
	this.brand=brand;
	this.year=year;
}

 void displayVehicleInfo(){
	 System.out.println("Vehicle Information");
	 System.out.println("...................");
	 System.out.println("Brand :"+ brand);
	 System.out.println("Year :"+ year);
	
}
}

class Car extends Vehicle {
	
	String model;
	
Car(String brand,String model,int year)
{
	
	this.model=model;
	super(year,brand);
	
}

void displayVehicleInfo() {
	super.displayVehicleInfo();
	System.out.println();
	System.out.println("Car Information");
	System.out.println("..................");
	System.out.println("Model :"+model);

}
}
public class Progarm3 {

	public static void main(String[] args) {
		
 Car c1=new Car("Toyota", "Fortuner", 2023);
 c1.displayVehicleInfo();
	}

}
