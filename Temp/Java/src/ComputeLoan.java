import java.util.Scanner;

public class ComputeLoan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// Create a scanner
		System.out.println("Enter annual interest rate.(e.g. 7.25(%) in percentage)");
		double annualInterestRate = input.nextDouble();// capture the interest
														// rate
		double monthlyInterestRate = annualInterestRate / 1200;// calculate the
																// monthlyrate
		//////////////////////////////////////////////////////////////////////////////////
		System.out.println("Enter number of years you want to loan money(as an integer).(e.g. 5,6,7,8,9)");
		int numberOfYears = input.nextInt();
		System.out.println("Enter loan amount. (e.g.1200000.95)");
		double loanAmount = input.nextDouble();
		///////////////////////////////////////////////////////////////////////////////////

		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

		double totalPayment = monthlyPayment * numberOfYears * 12;
		System.out.println("The monethly payment is $" + (int) (monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is $" + (int) (totalPayment * 100) / 100.0);
	}
}
 