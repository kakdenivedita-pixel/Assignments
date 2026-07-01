package WeeklyAssignments;

public class nestedifelse {

	public static void main(String[] args) {
		int age=18; char gender='M';
  if(age==18)
      {
	    System.out.println("congrats on your first vote");
	    if(gender=='F')
	      {
		  System.out.println("please vote girl");  
	      }
	    else
	      {
		  System.out.println("please vote boy");
		  }
	  }
  if (age>=18)
	      {
	       System.out.println("you can vote");
	      }
  else
      {
	  System.out.println("you can not vote");
	  }
	}
}

