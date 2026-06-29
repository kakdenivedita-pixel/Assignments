package WeeklyAssignments;

public class factorial_of_num {

	public static void main(String[] args) {
		int num=6;
		int factorial=1;
		
		for(int i=1 ;i<=num ;i++){
		factorial*= i;
		}
		System.out.println("Factorial of 6 = " + factorial);
	}

}
