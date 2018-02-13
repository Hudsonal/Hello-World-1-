
import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int diceRoll;
		System.out.println("How many dice are you using?");
		int dice = input.nextInt();
		diceRoll = (int)(6*Math.random())+1;
		int finalResult;
		int dieResult;
		int i;
		i = 0;
		dieResult = 
		while (i < dice); {
			diceRoll = (int)(6*Math.random())+1;
			finalResult = finalResult + diceRoll;
			dieResult = diceRoll;
			System.out.println("Your result is: "+ dieResult);
			i = i + 1;
		}
		
		
		
		
		System.out.println("Your dice roll result is: "+finalResult);
		
		input.close();
		
		
		

	}

}
