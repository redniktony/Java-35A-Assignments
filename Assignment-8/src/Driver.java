//Hua Xia
//CIS 35A 
//Assignment 6
//Due Date: June 13
//Submit Date: June 10

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("\t\tTriangle Information Program ");
		System.out.println("=============================================================");
		GeometricObject obj = new GeometricObject();
		GeometricObject.TriangleObject innerObj = obj.new TriangleObject();
		// creates the objects and files
		System.out.println("Enter three sides of the triangle: ");
		System.out.println("=============================================================");
		System.out.println("Please enter the value of the first side: ");
		// side 1
		input = new Scanner(System.in);
		double firstSide = input.nextDouble();
		innerObj.setFirstSide(firstSide);
		// interface
		// side 2
		System.out.println("Please enter the value of the second side: ");
		input = new Scanner(System.in);
		double secondSide = input.nextDouble();
		innerObj.setSecondSide(secondSide);
		// side 3
		System.out.println("Please enter the value of the third side: ");
		input = new Scanner(System.in);
		double thirdSide = input.nextDouble();
		innerObj.setThirdSide(thirdSide);
		// Getting the information from the color
		System.out.println("=============================================================");
		System.out.println("Please enter the color of the object: ");
		input = new Scanner(System.in);
		String color = input.nextLine();
		innerObj.setColor(color);
		boolean filled = true;
		// getting the information of the filled status
		System.out.println("Is it filled: (y or n)");
		int choice2;
		input = new Scanner(System.in);
		String choice = input.next();
		if (choice == "y") {
			choice2 = 1;
			if (choice2 == 1) {
				filled = true;
			} else {
				filled = false;
			}
		}//a selection for choose
		System.out.println("=============================================================");
		System.out.println("\t\tTriangle Information ");
		System.out.println("\nIs filled? " + filled + "\nColor: " + color);
		innerObj.printData();//print the further information
		System.out.println("=============================================================");
		System.out.println("Thanks for using!!!");
		System.out.println("=============================================================");
	}
}
