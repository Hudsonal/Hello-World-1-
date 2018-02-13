
import java.util.Scanner;

public class FirstNameLastNameLab {

	public static void main(String[] args) {
		
		//Scanner imported and use begin here
		
		Scanner input = new Scanner(System.in);
		//variables addressed here:
		
		System.out.println("Please enter your full name with a space in between "
				+ "the first and last name");
		//variables addressed here:
		String fullName = input.nextLine();
		String firstLength = " Your first name has: ";
		
		String lastLength = " Your last name has: ";
						
		int Space = fullName.indexOf(" "); 
		int length = fullName.length();
		//Full name variable separated here:
		
		String firstName = fullName.substring(0, Space);  
		
		String lastName = fullName.substring(Space+1,length);
		//Outputting the separate names 
		System.out.println("your first name is: " + firstName + firstLength 
					+ firstName.length() + " characters");
		
		System.out.println("Your last name is: " + lastName + lastLength + lastName.length() + " characters");
		
		
		System.out.println("Your initials are " + firstName.charAt(0)
							+ lastName.charAt(0));
		
		input.close();

	}

}
