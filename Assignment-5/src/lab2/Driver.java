package lab2;

import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) throws Exception {
		Student lab2[] = new Student[40];

		// Populate the student array
		if (lab2.length > 40) {
			System.out.println("Too Many Students!!! Delete some in order to continue!!!");
		}

		lab2 = Util.readFile("score.txt", lab2);

		Statistics statlab2 = new Statistics();

		Statistics.findlow(lab2);
		Statistics.findhigh(lab2);
		Statistics.findavg(lab2);
		
		StringTokenizer st = new StringTokenizer("Test");

		statlab2.findlow(lab2);
		// add calls to findhigh and find average
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
	// Print the data and statistics
}
