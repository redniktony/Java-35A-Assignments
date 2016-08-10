//Hua Xia
//CIS 35A Spring 2016
//Assignment 2
//Due Date April 25th
//Date Submitted April 25th
import java.util.Random;

public class Simulate {
	public String sideUp;

	public String toss() {
		String sideUp;
		Random randomSide = new Random();

		final int lowest = 0;
		final int highest = 1;
		int result = randomSide.nextInt((highest - lowest) + 1 + lowest);

		if (result == 0) {
			sideUp = "heads";
		} else {
			sideUp = "tails";
		}
		result = 0;
		return sideUp;
	}
}
