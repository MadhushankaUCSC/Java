import java.util.Scanner;
public class FullName
{
	
	public static void main(String args[])

	{ 
	
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter first name:");
		String firstName=sc.next();
		System.out.print("Enter last name:");
		String lastName=sc.next();
	
		System.out.println();

		System.out.println("Full Name is:" + firstName + " "+ lastName);
		System.out.println();
	}
}
		
