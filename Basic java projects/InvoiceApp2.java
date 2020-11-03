import java.util.Scanner;
public class InvoiceApp2


{
	public static void main(String args[])

	{
		
		//create a Scanner object
		Scanner sc=new Scanner(System.in);

		//read a string
		System.out.print("Enter product code : ");
		String productCode=sc.next();

		//read a double value
		System.out.print("Enter price : ");
		double price =sc.nextDouble();


		//read a int value
		System.out.print("Enter quantity:");
		int quantity=sc.nextInt();
		
		//perform a calculation and display result
		double total=price * quantity;
		System.out.println();
		System.out.println(quantity+ " " +productCode + " @ " + price +" = " +total);
		System.out.println();

	}
}
		
		