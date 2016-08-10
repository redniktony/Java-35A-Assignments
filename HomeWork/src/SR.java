//Hua Xia 
//CIS 35A 
//Assignment 1
//Due Date: April 18
//Submit Date: April 18

import java.util.Scanner;
import java.text.DecimalFormat;

public class SR {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Approximate Squre Root");
		System.out.println("=======================\n");
		System.out.println("Please enter your number: ");
		long n = input.nextLong();
		double value = sqrt(n);
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("The Squre root of " + n + " is: " + df.format(value));
	}

	public static double sqrt(long n) {
		double nextGuess = 1;
		double lastGuess = 1;
	
		do {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		} while (Math.abs(lastGuess - nextGuess) > 0.0001);
		
		return nextGuess;
	}
}
