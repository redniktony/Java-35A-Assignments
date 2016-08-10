//Hua Xia 
//CIS 35A 
//Assignment 5
//Due Date: May 16
//Submit Date: May 17

package lab2;

import Lab2Util.Util;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] lab2 = new Student[40];

		// Populate the student array
		lab2 = Util.readFile("score.txt", lab2);

		Statistics statlab2 = new Statistics();
		statlab2.findhigh(lab2);
		statlab2.findlow(lab2);
		statlab2.findavg(lab2);
		System.out.println("SID"+ "Qu1"+ "Qu2"+"Qu3"+ "Qu4"+ "Qu5");
		// Print the data and statistics
		for (int i = 0; i < lab2.length; i++) {
			lab2[i].printInfo();
		}
		System.out.println();
		statlab2.printscores();
	}
}