//Hua Xia
//CIS 35A 
//Assignment 6
//Due Date: June 13
//Submit Date: June 10

import java.util.*;

public class GeometricObject {
	String color;
	boolean filled;

	// constructor
	protected GeometricObject() {
	}

	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	// Inner class
	class TriangleObject {
		private double firstSide;
		private double secondSide;
		private double thirdSide;
		String color;
		boolean filled;

		Scanner input = new Scanner(System.in);

		// @Override
		// getters and setters
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public boolean isFilled() {
			return filled;
		}

		public void setFilled(boolean filled) {
			this.filled = filled;
		}

		public double getFirstSide() {
			return firstSide;
		}

		public void setFirstSide(double firstSide) {
			this.firstSide = firstSide;
		}

		public double getSecondSide() {
			return secondSide;
		}

		public void setSecondSide(double secondSide) {
			this.secondSide = secondSide;
		}

		public double getThirdSide() {
			return thirdSide;
		}

		public void setThirdSide(double thirdSide) {
			this.thirdSide = thirdSide;
		}

		// This is the calculate process
		public double calArea() {
			double p = (getFirstSide() + getSecondSide() + getThirdSide()) / 3;
			double triArea = Math.sqrt(p * (p - getFirstSide()) * (p - getFirstSide()) * (p - getFirstSide()));
			return triArea;
		}

		// This is the perimeter calculation
		public double calMeter() {
			double perimeter = getFirstSide() + getSecondSide() + getThirdSide();
			return perimeter;
		}

		// print out the information of inner class
		public String printData() {
			System.out.println("\nThe first side is: " + getFirstSide() + "\nThe second side is: " + getSecondSide()
					+ "\nThe third  side is: " + getThirdSide() + "\nThe area is: " + calArea() + "\nThe perimeter is: "
					+ calMeter());
			return "\nColor: " + color + " \nFilled? : " + filled;
		}
	}
}
