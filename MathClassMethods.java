
public class MathClassMethods {

	public static void main(String[] args) {
		
		int x = 9;
		double y = 16.0;
		int z = -13;
		
		
		
		System.out.println(Math.sqrt(x));//returns square root of x as double
		System.out.println(Math.sqrt(y));//returns square root of y as double
		System.out.println(Math.abs(z));
		System.out.println(Math.pow(2, x));
		
		System.out.println(Math.floor(x/y));//rounds down
		System.out.println(Math.ceil(x/y));//rounds up
		System.out.println(Math.round(x/y));//rounds "normally"
		System.out.println(10*Math.random()); //returns double between 0.0 and 1.0
										   //inclusive at 0, exclusive to 1
		
		
		
		

	}

}
