
public class CurrentTimeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		long startTime;		//represent when program starts
		long endTime;		//when program ends
		double runTime;		//time program ran in seconds
		
		startTime = System.currentTimeMillis();
double width, height, hypotenuse; // sides of a triangle
		
		width = 3.0;
		height = 4.0;
		hypotenuse = Math.sqrt( width*width + height*height );
		
		System.out.print("A triangle with sides 3 and 4 has hypotenuse ");
		System.out.println(hypotenuse);
		System.out.println("\nMathematically, sin(x)*sin(x) + "
							+ "cos(x)*cos(x) - 1 should be 0.");
		System.out.println("Let’s check this for x = 1:");
		System.out.print(" sin(1)*sin(1) + cos(1)*cos(1) - 1 is ");
		System.out.println( Math.sin(1)*Math.sin(1)
							+ Math.cos(1)*Math.cos(1) - 1 );
		System.out.println("(There can be round-off errors when"
							+ " computing with real numbers!)");
		System.out.print("\nHere is a random integer from 0-9: ");
		System.out.println( (int)(10*Math.random()) );
		System.out.print("Here is a random integer from 0-99: ");
		System.out.println( (int)(100*Math.random()) );
		
		System.out.print("\nThe value of Math.PI is ");
		System.out.println( Math.PI );
		
		System.out.print("The value of Math.E is ");
		System.out.println( Math.E );
		
		endTime = System.currentTimeMillis();
		runTime = (endTime - startTime)/1000.0;
		System.out.print("This program ran for: " + runTime + " seconds");
		
		
	
			} // end main()
		 // end class CurrentTimeMethod


	}

