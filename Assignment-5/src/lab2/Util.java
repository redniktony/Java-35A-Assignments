package lab2;

import java.io.*;

class Util {
	static Student[] readFile(String filename, Student[] number) throws Exception {
		// Reads the file and builds student array
		// Open the file using FileReader Object.
		// In a loop read a line using readLine method.
		// Tokenize each line using StringTokenizer Object
		// Each token is converted from String to Integer using parseInt method
		// Value is then saved in the right property of Student Object.
		String x;
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);

		while ((x = br.readLine()) != null) {
			System.out.println(x);
		}
		fr.close();
		return number;
	}

	Student a1[][] = new Student[40][6];

	public static void read() {
	}
}