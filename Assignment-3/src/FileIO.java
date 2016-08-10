
//Hua Xia 
//CIS 35A 
//Assignment 3
//Due Date: May 2
//Submit Date: May 2

import java.io.*;
import java.util.*;
import java.util.Scanner;

//Read the File and populate a Franchise
//The method of this project is reading a text
//Franchise readDatea (String filename)
public class FileIO {
	private String fname = null;// make default file name to null
	private boolean DEBUG = true;// true means keep running

	public FileIO(String fname) {
		this.fname = fname;// CONSTRUCTOR
	}

	public Franchise readData() {
		Franchise a1 = null;
		int counter = 0;

		try {// Using the try loop to do the testing error and read data
			FileReader file = new FileReader(fname);
			BufferedReader buff = new BufferedReader(file);// BufferedReader
															// file
			String temp;
			boolean eof = false;
			// boolean variable make it ends reading the file
			while (!eof) {
				String line = buff.readLine();
				counter++;
				///////////////////////////////////////////////////
				if (line == null)// This is important because if the file ends
									// make the read end
					eof = true;
				//////////////////////////////////////////////////
				else {
					if (DEBUG)
						// System.out.println("Reading " + line + "\n");
						// This is the first reading process of reading the
						// store
						// number
						// line means the place where we read
						if (counter == 1) {// reading the first line of the file
						temp = line;
						a1 = new Franchise(Integer.parseInt(temp));
						if (DEBUG)
						System.out.println("The Number of Stores " + a1.numberofstores() + "\n");
						// Printing the number of stores
						}

					if (counter == 2)
						;// The second line is the Day. We dont need to use
							// that.

					if (counter > 2) {
						int x = buildStore(a1, (counter - 3), line);
						if (DEBUG)
							System.out.println("Reading Store # " + (counter - 2) + " Number of weeks read = " + x);
						if (DEBUG) {
							System.out.println("");
							// calling the
							// function
							// at Store
							a1.getStores(counter - 3).printdata();
							// calling
						}
					}
				}
			}
			buff.close();
		} catch (Exception e) {
			System.out.println("Error -- " + e.toString());// error mesg
		}
		return a1;
	}

	// This is to get the store value

	public int buildStore(Franchise a1, int counter, String temp) {
		Store tstore = new Store();
		String s1 = "";
		float sale = 0.0f;
		int week = 0;
		int day = 0;

		StringTokenizer st = new StringTokenizer(temp);

		while (st.hasMoreTokens()) {
			for (day = 0; day < 7; day++) {
				s1 = st.nextToken();
				sale = Float.parseFloat(s1);
				tstore.setsaleforweekdayintersection(week, day, sale);
			}
			week++;
		}
		a1.setStores(tstore, counter);
		return week;
	}
}
