//Hua Xia 
//CIS 35A 
//Assignment 3
//Due Date: May 9
//Submit Date: May 9
public class SavingsAccount {
	protected static float savingsBalance = 0;
	protected static double annualInterestRate = 0;

	protected SavingsAccount(float balance) {
		savingsBalance = balance;
		// annualInterestRate = 0;
	}

	protected static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}

	protected static float getBalance() {
		return savingsBalance;
	}

	protected void calculateMonthlyInterest() {
		System.out.println("Current balance: " + savingsBalance);
		double monthlyInterest;
		monthlyInterest = savingsBalance * (annualInterestRate / 12);
		float print = (float) monthlyInterest;
		System.out.println("Your monthly interest is " + print);
		savingsBalance += monthlyInterest;
		System.out.println("New savings balance: " + savingsBalance);
		System.out.println("");
	}
}




