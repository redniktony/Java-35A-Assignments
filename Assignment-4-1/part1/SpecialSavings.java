//Hua Xia 
//CIS 35A 
//Assignment 3
//Due Date: May 9
//Submit Date: May 9

//extends to savingAccount
class SpecialSavings extends SavingsAccount
{
    protected SpecialSavings(float balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	protected static void modifyInterestRate()
    {
//if the saving is more than 10000 set the interest to 10% per year
        if(SavingsAccount.getBalance() >= 10000)
        {
            modifyInterestRate(.1);
        }
		
    }
}
