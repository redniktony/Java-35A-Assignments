//Hua Xia
//CIS 35A 
//Assignment 6
//Due Date: May 30
//Submit Date: June 10
package lab2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Student lab2[] = new Student[40];// generate the arrays
		// Populate the student array
		for (int i = 0; i < 40; i++) {
			lab2[i] = new Student();
		}
		// Interface
		System.out.println("\t\tClass Score Calculator");
		System.out.println("===================================================");
		System.out.println("This Program calculate the class score txt file which ");
		System.out.println("have putted on the project folder. In the program end.");
		System.out.println("You can see the Lowest, Highest and average score for \neach quiz. ");
		System.out.println("===================================================");
		System.out.println("Please Enter Your (.txt) File Name: ");
		String filename = input.next();
		lab2 = Util.readFile(filename + ".txt", lab2);
		System.out.println("\n===================================================");
		System.out.printf("Stud Qu1 Qu2 Qu3 Qu4 Qu5\n");
		System.out.println("===================================================");
		//
		for (int row = 0; row < Util.number; row++) {
			Student.printInfo(lab2[row]);
		}
		// Calculate and Print the Data
		Statistics statlab2 = new Statistics();
		statlab2.findlow(lab2);
		statlab2.findhigh(lab2);
		statlab2.findavg(lab2);
		System.out.println();
		statlab2.printlow();
		statlab2.printhigh();
		statlab2.printaverage();
		System.out.println("===================================================");
		// This comes from the Statics
		// add calls to find high and find average
		// Print the data and statistics
		// print the values
		// Concepts of Serialization
		String filename2 = "";
		System.out.println("\nPlease Enter The (.ser) File Name You Want to Save: ");
		filename2 = input.next();
		String workingDirectory = System.getProperty("user.dir");
		String absoluteFilePath = "";
		absoluteFilePath = workingDirectory + File.separator + filename2;
		try {
			// opening file
			FileOutputStream fileOut = new FileOutputStream(absoluteFilePath + ".ser");
			// write data into file
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			for (int i = 0; i < 40; i++) {
				out.writeObject(lab2[i]); // writing each student data
			}
			// closing file and object output streams
			out.close();
			fileOut.close();
			System.out.println("===================================================");
			System.out.println("\t\tFile Saved...100% \n\n\t\tPROGRAM EXIT");
			System.out.println("===================================================");
		} catch (IOException i) { // catch the error and exit
			i.printStackTrace();
		}
	}

}
