import java.util.Scanner;
public class FindTotal

{
	public static void main(String args[])

	{	
  		Scanner sc = new Scanner(System.in);



		total=0;
		count=0;

		while(count<6);

		  {

			System.out.print("Enter number :");
			int number = sc.newInt();
			total = total + number;
			count = count + 1;

		  }

		System.out.println(total);

	}

}
