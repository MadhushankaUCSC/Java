import java.util.Scanner;
public class FindMax


{
	public static void main(String args[])
	 {
		Scanner sc = new Scanner(System.in);
	

		System.out.print("Enter first number:");
		int firstNumber=sc.nextInt();
		System.out.print("Enter secound number:");
		int secoundNumber=sc.nextInt();
		System.out.print("Enter third number:");
		int thirdNumber=sc.nextInt();

		if(firstNumber > secoundNumber)
		 
		  if(firstNumber>thirdNumber)
			System.out.println("max number is:" + firstNumber);
		  else
			System.out.println("max number is:" + thirdNumber);


		else
		  if(secoundNumber > thirdNumber)
			System.out.println("max number is:" + secoundNumber);
		  else
		        System.out.println("max number is:" + thirdNumber);
	 }
}