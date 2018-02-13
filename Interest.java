/*This program will calculate and print out interest 
 * earned and new principal on a $17,000
 * investment at 7% for one year
 */ 
import java.util.Scanner; 

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare the variables for this program
		
		Scanner input = new Scanner(System.in);
		
									//this is the 17000 investment
									//this is 7% interest
		double interest;  			// total interest
		
		
		
		//set values to those variable and do the calculations
		System.out.println("How much money are you investing?");
		double principal = input.nextDouble();
		System.out.println("What is your local interest rate in decimal form?");
		double rate = input.nextDouble();
		System.out.println("How many years do you plan to invest?");
		int year = input.nextInt();
		int i = 0;
		interest = principal * rate;
		//compound interest system addressed below
		while (i < year) {
				interest = principal * rate;
				principal = principal + interest;
				
				i = i + 1;
				System.out.println(Math.round(principal));
		}		
		

		// add interest onto previous principal
		//initializes a variable called outline of string type
		String outputline = "your annual interest earned is: $" ;
		//output the results
		System.out.println(outputline + Math.round(interest));
		System.out.print("your new principal value is: $");
		System.out.println(Math.round(principal));
		
		
		input.close();
	}

}
