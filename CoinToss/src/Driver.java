//Hua Xia
//CIS 35A Spring 2016
//Assignment 2
//Due Date April 25th
//Date Submitted April 25th
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("\t\tWelcom To Coin Toss Game!!!");
		System.out.println("===================================================");
		System.out.println("Please enter how many times you want toss the coin:");
		int times = input.nextInt();
		System.out.println("===================================================");
		int coinHeadsCounter = 0;
		int coinTailsCounter = 0;
		for (int i = 1; i <= times; i++) {
			Coin cointoss = new Coin();
			if (cointoss.getSideUp() == "heads") {
				System.out.println(i + ". Toss result: " + cointoss.getSideUp());
				coinHeadsCounter++;
			} else {
				System.out.println(i + ". Toss result: " + cointoss.getSideUp());
				coinTailsCounter++;
			}
		}
		System.out.println("===================================================");
		System.out.println("Final Count for Toss"); 
		System.out.println("Heads: " + coinHeadsCounter);
		System.out.println("Tails: " + coinTailsCounter);
		System.out.println("===================================================");
	}
}
