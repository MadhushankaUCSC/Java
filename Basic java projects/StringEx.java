public class StringEx


{
	public static void main(String args[])
	{
		//Example1	
		String message1=" Invalid data entry";
		String message2=" ";
		String message3="null";
	
		System.out.println(message1);
		System.out.println(message2);
		System.out.println(message3);
		//Example2
		String firstName="Bob";
		String lastName="Smith";
		String Name=firstName+" "+ lastName;
		
		System.out.println(Name);

		//Example3
		double price=14.95;
		String priceString="price:" +price;
		System.out.println(priceString);

		//Example4
		firstName="Bob";
		lastName="Smith";
		name=firstName + " ";
		name=name + lastName;
		System.out.println(Name);

		//Example5
		firstName="Bob";
		lastName="Smith";
		name=firstName + " ";
		name+= lastName;
		System.out.println(Name);
	}

}