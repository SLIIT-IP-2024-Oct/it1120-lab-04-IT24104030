import java.util.Scanner;

public class IT24104030Lab4Q1{
	public static void main (String [] args)
	{
	Scanner input = new Scanner(System.in);

	//Take a number/input from user
	System.out.print("Enter a number: ");
	double number = input.nextDouble();
	
	//Display that number is posive or negative or zero
	if (number>0){
		System.out.print("The number is: Positive");
	}else if (number<0){
		System.out.print("The number is: Negative");
	}else{
		System.out.print("The number is Zero");
		}
	}
}