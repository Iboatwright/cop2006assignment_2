/**
 * 
 */


/**
 * @author Anon
 *
 */
import java.util.Scanner;

public class AreaCalc {

	/**
	 * @param args
	 */
	
	// tests if user input is equal to 1 or 2.
	public static boolean validChoice(int choice){
		boolean isValid = true; // default return value is true
		if ((choice != 2) && (choice != 1)){ // if user input is not 1 or 2
			isValid = false; // set return value to false
		}
		return isValid; // returns the boolean true or false
	}
	
	// multiplies the two inputs then divides them by 2 
	public static double calcTriangleArea(int b, int h){
		return ((b * h)/2.0); // returns the calculated area
	}
	
	// raises the input to the second power then multiplies by pi
	public static double calcCircleArea(int r){
		return ((double)(Math.PI * Math.pow(r, 2))); //returns calculated area
	}
	
	public static void main(String[] args) {
		// TODO Need to create git repo and branch this to use the switch statement and 
		//		not the validChoice method.
		int choice;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter either 1 or 2: ");
		choice = in.nextInt();
		if (!validChoice(choice)){
			
		}
		switch (choice){
			case 1: 
				break;
			case 2:
				break;
			default:
				System.out.println("Please rerun the program entering either " +
					"1 or 2.");
				System.exit(0);
		}
	}

}
