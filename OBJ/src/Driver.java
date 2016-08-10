import java.util.Scanner;

public class Driver {
	private static Scanner input;
	/** Main method */
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("\t\tTriangle Information Program ");
		System.out.println("=============================================================");
		// Prompt the user to enter three sides of a triangle a color
		// and a Boolean value to indicate whether the triangle is filled
		
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		System.out.println("Enter a color: ");
		String color = input.next();

		System.out.println("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		// Create a Triangle
		Triangle triangle = new Triangle(side1, side2, side3, color, filled);
		System.out.println(triangle);
		System.out.println("Thanks for using!!!");
		System.out.println("=============================================================");
	}
}
