package lab2;
//Hua Xia
//CIS 35A 
//Assignment 6
//Due Date: June 6
//Submit Date: June 10

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Grade[] stu = new Student[40];
		System.out.println("\t\tClass Score Calculator");
		System.out.println("===================================================");
		System.out.println("This Program calculate the class score txt file which ");
		System.out.println("have putted on the project folder. In the program end.");
		System.out.println("You can see the Lowest, Highest and average score for \neach quiz. ");
		System.out.println("===================================================");
		System.out.println("Please Enter Your (.txt) File Name: ");
		String filename = input.next();
		stu = FileIO.readFile(filename + ".txt", stu);
		System.out.println("\n===================================================");
		Stats calculator = new Stats();
		for (int i = 0; i < stu.length; i++) {
			calculator.findlow(stu);
			calculator.findhigh(stu);
			calculator.findavg(stu);
			;
		}
		ReportCard(stu, calculator);
	}

	private static void ReportCard(Grade[] a, Stats s) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i].printAll();
		}
		s.printAll();
		int temp = 0, temp2 = 0, temp3 = 0, temp5 = 0;
		String temp4 = " ";
		System.out.println("===================================================");
		System.out.println("Please enter ID for student score data");
		System.out.print("\nEnter ID: ");

		do {
			temp = input.nextInt();
			for (int i = 0; i < a.length; i++) {
				temp2 = a[i].SIDForScores(temp);
				if (temp2 == 1) {
					temp3 = i;
					i = a.length;
				}
			}
			if (temp2 == 1) {
				a[temp3].printAll();
				System.out.print("Use it again?(y or n): ");

				temp4 = input.next();
				if (temp4.equalsIgnoreCase("y")) {
					System.out.print("Enter ID for scores: ");
				} else if (temp4.equalsIgnoreCase("n")) {
					temp5 = 1;
					System.out.println("Thanks for using!!!");
					System.out.println("===================================================");
				}
			} else {
				System.out.print("No match ID" + "\nPlease try it agian?(y or n): ");
				temp4 = input.next();
				if (temp4.equalsIgnoreCase("y")) {
					System.out.print("Enter ID for scores: ");
				} else if (temp4.equalsIgnoreCase("n")) {
					temp5 = 1;
				}
			}
		} while (temp5 == 0);
		input.close();
	}
}
