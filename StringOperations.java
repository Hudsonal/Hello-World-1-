/*This class plays around with different string methods
 * something of type String is an object in the string 
 * category and has access to all methods of that class
 */ 
public class StringOperations {

	public static void main(String[] args) {
		//declare four string variables
		String commentOne;
		String commentTwo;
		String commentThree;
		String commentFour;
		
		//assign values to variables
		commentOne = "    That was a great game!     ";
		commentTwo = "Go Eagles!";
		commentThree = "go eagles!";
		commentFour = "Eagles";
		
		
		/* Use variety of methods belonging to String class
		 * equals(), equalsIgnoreCase(), length(), charAt()
		 * substring(, indexOf(), ...
		 */
		
		//equals(string) is boolean type, t is similar, otherwise false
		System.out.println(commentTwo.equals(commentThree));
		System.out.println(commentThree.equals("go patriots"));
		
		//length() returns the number of characters in a string
		System.out.println(commentOne.length());
		
		//charAt(N), where N is index you check
		
		System.out.println(commentOne.charAt(20));
		// first character = 0 and last character 
		
		
		//substring(N, M), where n is beginning index of substring and m is ending index
		System.out.println(commentTwo.substring(1, 4));
		
		
		//can check if one string is in another using indexOf(string)
		
		System.out.println(commentOne.indexOf(commentFour));
		System.out.println(commentTwo.indexOf(commentFour));
		
		//convert string to all upper or all lower case
		System.out.println(commentTwo.toUpperCase());
		System.out.println(commentThree.toUpperCase());
		commentTwo = commentTwo.toUpperCase();
		commentThree = commentThree.toUpperCase();
		System.out.println(commentTwo.equals(commentThree));
		//remove non-printed characters using trim()
		String noSpaceComment;
		System.out.println(commentTwo.trim());
		noSpaceComment = commentOne.trim();
		System.out.println(noSpaceComment);
		
		
		
		
	}

}
