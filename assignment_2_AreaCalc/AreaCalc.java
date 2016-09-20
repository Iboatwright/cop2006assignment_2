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
	
	// multiplies the two inputs then divides them by 2 
	public static double calcTriangleArea(int b, int h){
		return ((b * h)/2.0); // returns the calculated area
	}
	
	// raises the input to the second power then multiplies by pi
	public static double calcCircleArea(double r){
		return ((double)(Math.PI * Math.pow(r, 2))); //returns calculated area
	}
	
	public static void main(String[] args) {
		// TODO format output values to match assignment requirements
		int choice;
		double r;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter either 1 or 2: ");
		choice = in.nextInt();
		switch (choice){
			case 1: 
				System.out.print("Please enter a non-negative number for radius: ");
				r = in.nextDouble();
				if (r < 0){
					System.out.println("Number " + r + " entered is negative. Program exits.");
				}
				else {
					System.out.println("Area of a circle with radius="+r+": "+ calcCircleArea(r));
				}
				
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
