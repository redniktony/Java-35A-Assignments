//Hua Xia
//CIS 35A Spring 2016
//Assignment 2
//Due Date April 25th
//Date Submitted April 25th
import java.util.Scanner;

public class DataStruct {
	public static void main(String[] args) {
		System.out.println("\t\t   Personal Information Table");
		System.out.println("===================================================================");
		System.out.println("Type how many people you want to record their personal information");
		System.out.println("===================================================================");
		System.out.println("People Need Record: ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();

		for (int i = 1; i <= choice; i++) {
			printer print = new printer();
			InfoTable info = new InfoTable();
			print.printInformation(info);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~END OF " + i + " people~~~~~~~~~~~~~~~~~~~~~\n\n");
		}
		System.out.println("You have recored " + choice + " people so far! Thanks for using!!!");
	}
}
