
//Lucille Cao
//CIS 35A 
//Assignment 6
//Due Date: May 30
//Submit Date: June 9

import java.io.*;
import java.util.*;

public class Util {
	public static int numOfStudent = 0;

	static Student[] readFile(String filename, Student[] stu) {
		int row = 0, col = 0;
		String line;
		try {
			// open FileReader and buffered reader
			FileReader file = new FileReader(filename);
			BufferedReader buff = new BufferedReader(file);
			int[] scores = new int[5];
			while ((line = buff.readLine()) != null) {
				// convert string to integer
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					// write in array
					if (col == 0) {
						stu[row].setSID(Integer.parseInt(st.nextToken()));
					} else
						scores[col - 1] = Integer.parseInt(st.nextToken());
					col++;
					stu[row].recordScores(scores);
				}
				col = 0;
				row++;
			}
			countStudents(row);
			buff.close();
			file.close();
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
		return stu;
	}

	// return the true size of data file

	public static void countStudents(int numOfStudents) {
		numOfStudent = numOfStudents;
	}
}