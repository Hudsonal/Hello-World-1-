/*this program will practice getting user input,
 * output to the display, and assigning variables
 * of different type
*/
import java.util.Scanner;   //this allows us to use the scanner

// everything must be in a class
public class TestGrade {

	//must have main() method, it's the starting point
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this outputs to display
		System.out.println("what was your test grade?");
		//this create "input" to store user input
		Scanner input = new Scanner(System.in);
		
		double myGrade = input.nextDouble();
		
		int gradeBump;		//declares the variable gradeBump
		gradeBump = 3;      // set the value of gradeBump yo 3
		
		double newGrade = myGrade + gradeBump;
		
		String outputLine = "Your new grade is: ";
		
	    System.out.println(outputLine + newGrade);
		
		input.close();
	}

}
