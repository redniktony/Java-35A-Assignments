//Lucille Cao
//CIS 35A 
//Assignment 6
//Due Date: May 30
//Submit Date: June 9

public class Statistics {

	int[] lowscores = new int[5];
	int[] highscores = new int[5];
	float[] avgscores = new float[5];
	int numStudent = Util.numOfStudent;

	void findLow(Student[] a) {
		// find lowest score
		int low = 100;
		for (int col = 0; col < 5; col++) {
			for (int row = 0; row < numStudent; row++) {
				if (low > a[row].getScores(col)) {
					low = a[row].getScores(col);
				}
			}
			lowscores[col] = low;
			low = 100;
		}
	}

	void findHigh(Student[] a) {
		// find highest score
		int high = 0;
		for (int col = 0; col < 5; col++) {
			for (int row = 0; row < numStudent; row++) {
				if (high < a[row].getScores(col)) {
					high = a[row].getScores(col);
				}
			}
			highscores[col] = high;
			high = 0;
		}
	}

	void findAvg(Student[] a) {
		// find average score
		int sum = 0;
		for (int col = 0; col < 5; col++) {
			for (int row = 0; row < numStudent; row++) {
				sum += a[row].getScores(col);
			}
			if (numStudent == 0)
				avgscores[col] = 0;
			else
				avgscores[col] = (float) sum / numStudent;
			sum = 0;
		}
	}

	// print lowest score
	public void printLow() {
		System.out.printf("The Lowest Score is:  ");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%5d ", lowscores[i]);
		}
		System.out.println();
	}

	// print highest score
	public void printHigh() {
		System.out.printf("The Highest Score is: ");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%5d ", highscores[i]);
		}
		System.out.println();
	}

	// print average score
	public void printAvg() {
		System.out.printf("The Average Score is: ");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%5.1f ", avgscores[i]);
		}
		System.out.println();
	}
}