//Hua Xia 
//CIS 35A 
//Assignment 1
//Due Date: April 18
//Submit Date: April 18

import java.util.Scanner;
import java.text.DecimalFormat;

public class ComputeLoan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// Create a scanner

		System.out.println("Loan Amount: ");
		double loanAmount = input.nextDouble();

		System.out.println("Number of Years: ");
		int numberOfYears = input.nextInt();

		System.out.println("Annual Interest Rate: ");
		double annualInterestRate = input.nextDouble();// capture the interest
														// rate
		///////////////////////////////////////////////////////////////////////////////////

		double monthlyInterestRate = annualInterestRate / 1200;// calculate the
																// monthly rate
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		System.out.printf("\n");
		System.out.println("Monethly Payment is: " + (int) (monthlyPayment * 100) / 100.0);
		System.out.println("Total Payment: " + (int) (totalPayment * 100) / 100.0);
		System.out.printf("\n");

		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println("Payment#\t\tInterest\t\tPrincipal\t\tBalance");
		int i = 1;
		double balance = loanAmount;// Make the same content
		/*
		 * This is the loop from the book
		 */
		for (i = 1; i <= numberOfYears * 12; i++) {
			double interest = monthlyInterestRate * balance;
			double principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.println(i + "\t\t\t" + df.format(interest) + "\t\t\t" + df.format(principal) + "\t\t\t"
					+ df.format(balance));
		}
	}
}
