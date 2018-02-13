
import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Variables and beginning statements addressed here:
		System.out.println("Please insert first number");
		 int firstNumber = input.nextInt();
		//first variable addressed above
		
		System.out.println("Please insert second number");
		int secondNumber = input.nextInt();
		/*Second variable addressed above
		 *calculations begin here
		 */
		int sum = firstNumber + secondNumber;//sum addressed here
		int difference = firstNumber - secondNumber;//difference addressed here
		int product = firstNumber * secondNumber;//product addressed here
		int quotient = firstNumber / secondNumber;//quotient addressed here
		int remainder = firstNumber % secondNumber;//remainder addressed here
		
		
		
		System.out.println("the sum of "+ firstNumber +
		" and " + secondNumber + " is: " + sum );
		System.out.println("the difference " + 
		"of " + firstNumber +  " and "  + secondNumber + " is: " + difference );
		System.out.println("the product of "
		+ firstNumber  + " and "  + secondNumber + " is: " + product );
		System.out.println("the quotient of "+ firstNumber + 
		" and " + secondNumber + " is: " + quotient ); 
		System.out.println("the remainder of " 
		+ firstNumber + " and " + secondNumber + " is: " + remainder);
		
		
		
		input.close();

	}

}
