//Hua Xia 
//CIS 35A 
//Assignment 3
//Due Date: May 2
//Submit Date: May 2

import java.util.Scanner;

//function of this main
//read data 
//analyze results for each store
//print for each store
/*
 
 */
public class Driver {
	public static void main(String[] args) {
		int number = 0;// the selection for the store number
		int choice = 0;// the selection for the group
		char character = 'n';

		Scanner input = new Scanner(System.in);
		FileIO a1 = new FileIO("/Users/redniktony/Documents/workspace/Assignment 3/src/Salesdat.txt");
		System.out.println("\tWelcome to the Store Data Reader");
		System.out.println("---------------------------------------------------------");
		System.out.println("\tREADING A FROM A FILE AND PROCESS THE DATA");
		System.out.println("1.The total sales for each week. ");
		System.out.println("2.The average daily sales for each week.");
		System.out.println("3.The total sales for all the weeks.");
		System.out.println("4.The average weekly sales.");
		System.out.println("5.The week with the highest amount in sales.");
		System.out.println("6.The week with the lowest amount in sales.");
		System.out.println("---------------------------------------------------------");
		System.out.println("Press 1 to print the data from the text file.....");
		number = input.nextInt();// collecting the data
		Franchise f = a1.readData();// calling FileIO

		System.out.println("\tStore Data Reader Menu");
		System.out.println("---------------------------------------------------------");
		System.out.println("1.The total sales for each week. ");
		System.out.println("2.The average daily sales for each week.");
		System.out.println("3.The total sales for all the weeks.");
		System.out.println("4.The average weekly sales.");
		System.out.println("5.The week with the highest amount in sales.");
		System.out.println("6.The week with the lowest amount in sales.");
		System.out.println("---------------------------------------------------------");
		do {
			System.out.println("\nPlease enter your selection by number:");
			choice = input.nextInt();
			System.out.println("Please enter your Store number:");
			number = input.nextInt();
			number = number - 1;
			/*
			 * Using Switch box for selection the process data type 7 cases
			 */
			switch (choice) {
			case 1:
				System.out.println("");
				f.getStores(number).totalSales();// total sales for each week
				System.out.println("Process finish. Do you want to return menu? (y/n)");
				character = input.next().charAt(0);
				break;
			case 2:
				System.out.println("");
				f.getStores(number).dailySale();// daily sale per week
				System.out.println("Process finish. Do you want to return menu? (y/n)");
				character = input.next().charAt(0);
				break;
			case 3:
				System.out.println("");
				f.getStores(number).totalSaleWeek();// total sale per week
				System.out.println("Process finish. Do you want to return menu? (y/n)");
				character = input.next().charAt(0);
				break;
			case 4:
				f.getStores(number).averagePerWeek();// average sale per week
				System.out.println("Process finish. Do you want to return menu? (y/n)");
				character = input.next().charAt(0);
				break;
			case 5:
				f.getStores(number).highestSaleWeek();// highest sale per week
				System.out.println("Process finish. Do you want to return menu? (y/n)");
				character = input.next().charAt(0);
				break;
			case 6:
				f.getStores(number).lowestSaleWeek();// lowest sale per week
				System.out.println("Process finish. Do you want to return menu? (y/n)");
				character = input.next().charAt(0);
				break;
			default:
				System.out.println("Please Enter a vaild number!!!");
			}
		} while (character == 'y');//out of the loop by typing y/n
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Thanks for using.");//exit info
	}
}