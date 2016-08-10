//Hua Xia 
//CIS 35A 
//Assignment 3
//Due Date: May 9
//Submit Date: May 9
public class Driver {
	public static void main(String[] args) {//This is setting the money to 2000
		SavingsAccount saver1 = new SavingsAccount(2000);
		saver1.modifyInterestRate(.04);//4% interest
		saver1.calculateMonthlyInterest();
		saver1.modifyInterestRate(.05);//5% interest
		saver1.calculateMonthlyInterest();
		System.out.println("==================================");//This is setting the money to 3000
		SavingsAccount saver2 = new SavingsAccount(3000);
		saver2.modifyInterestRate(.04);//set the interest to 4%
		saver2.calculateMonthlyInterest();
		saver2.modifyInterestRate(.05);//This is set the interest to 5%
		saver2.calculateMonthlyInterest();
		System.out.println("==================================");//This set the to the specialsavings
		SavingsAccount saver3 = new SpecialSavings(10000);
		saver3.calculateMonthlyInterest();//just jump to the interest of 0.1 per year
		saver3.calculateMonthlyInterest();
	}
}