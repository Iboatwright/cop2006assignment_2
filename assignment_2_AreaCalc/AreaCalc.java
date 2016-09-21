// COP 2006 Assignment #1 

import java.util.Scanner;

public class AreaCalc {
	
	// multiplies the two inputs then divides them by 2 
	public static double calcTriangleArea(int b, int h){
		return ((double)((b * h)/2.0)); // returns the calculated area
	}
	
	// raises the input to the second power then multiplies by pi
	public static double calcCircleArea(double r){
		return ((double)(Math.PI * Math.pow(r, 2))); //returns calculated area
	}
	
	public static void main(String[] args) {
		// TODO format output values to truncate trailing zeros
		int choice; //user menu selection variable
		double r; 	//radius
		int b;	 	//base
		int h;		//height
	    String a;	//calculated area
		Scanner in = new Scanner(System.in); //initialize Scanner object
		
		//User selection menu
		System.out.print("Please enter either 1 or 2: ");
		choice = in.nextInt();
		
		//switch uses the user input from choice to activate a specific case
		switch (choice){
			case 1: // Triangle Area Calculation
				System.out.print("Please enter two non-negative integers for "
						+ "base and height: ");
				b = in.nextInt();
				h = in.nextInt();
				
				if ((b < 0) || (h < 0)){ //test for negative inputs
					int err;//negative number error variable
					err = (b<0)?b:h; //assign the negative number to err var
					System.out.println("Number " + err + " entered is "
							+ "negative. Program exits.");
					System.exit(0); //quit program cleanly
				}
				else {//calculate area and display formatted result
					a = "" + calcTriangleArea(b,h); //get triangle area
					// format area for pretty output
					a = a.indexOf(".") < 0 ? a : 
						a.replaceAll("([0-9]{1,3})*$", "$1")
							.replaceAll("0*$", "").replaceAll("\\.$", "");
					a = a.indexOf(".") < 0 ? a + ".0":a;
					System.out.print("Area of a triangle with base=" + b +
							", height=" + h +": "+ a);
				}
				break;
			case 2://Circle Area Calculation
				System.out.print("Please enter a non-negative number for "
						+ "radius: ");
				r = in.nextDouble();
				if (r < 0){//test for negative input
					System.out.println("Number " + r + " entered is negative. "
							+ "Program exits.");
					System.exit(0);//end program
				}
				else {//calculate area and display formatted result
					a = "" + calcCircleArea(r); //get circle area
					// format area for pretty output
					a = a.indexOf(".") < 0 ? a : 
						a.replaceAll("([0-9]{1,3})*$", "$1")
							.replaceAll("0*$", "").replaceAll("\\.$", "");
					a = a.indexOf(".") < 0 ? a + ".0":a;
					System.out.print("Area of a circle with radius="+r+": " 
							+ a);
				}
				
				break;
			default: //some value other than 1 or 2 was entered by the user
				System.out.println("Please rerun the program entering either "
						+ "1 or 2.");
				System.exit(0);//end program
		}
	}

}
