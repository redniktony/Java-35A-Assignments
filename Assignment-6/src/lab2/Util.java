//Hua Xia
//CIS 35A 
//Assignment 6
//Due Date: May 30
//Submit Date: June 10
package lab2;

import java.io.*;
import java.util.*;

public class Util {

	public static int number = 0;

	static Student[] readFile(String filename, Student[] stu) {
		int row = 0, column = 0;
		String line;
		try {

			FileReader file = new FileReader(filename);
			BufferedReader buff = new BufferedReader(file);
			int[] scores = new int[5];
			while ((line = buff.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				// System.out.println(line);
				while (st.hasMoreTokens()) {
					if (column == 0) {//student ID area
						stu[row].setSID(Integer.parseInt(st.nextToken()));
					} else {
						scores[column - 1] = Integer.parseInt(st.nextToken());//quiz score area 
					}
					column++;//move to the next quiz
					stu[row].recordScores(scores);//upload the data to scores array
				}
				row++;//next student 
				column = 0;//reset the column of quiz
			}
			numberOfStudent(row);
			file.close();
			buff.close();
		} catch (IOException e) {//error and exit
			System.out.println("===================================================");
			System.out.println("Error -- " + e.toString());
			System.out.println("\n\tPlease restart the progam");
			System.out.println("===================================================");
			System.exit(0);
		}
		return stu;
	}

	public static void numberOfStudent(int numbers) {
		number = numbers;//count how many students here
	}

	// Reads the file and builds student array.
	// Open the file using FileReader Object.
	// In a loop read a line using readLine method.
	// Tokenize each line using StringTokenizer Object
	// Each token is converted from String to Integer using parseInt method
	// Value is then saved in the right property of Student Object.
}
