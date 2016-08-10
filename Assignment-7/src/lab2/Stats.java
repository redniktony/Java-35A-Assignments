package lab2;

//Hua Xia
//CIS 35A 
//Assignment 6
//Due Date: June 6
//Submit Date: June 10

public class Stats extends Grade implements Inter {
	private int[] lowscores = new int[5];
	private int[] highscores = new int[5];
	private float[] avgscores = new float[5];

	// Default Constructor
	Stats(int[] lowscores, int[] highscores, float[] avgscores) {
		this.lowscores = lowscores;
		this.highscores = highscores;
		this.avgscores = avgscores;
	}

	Stats() {
	}

	// calculation methods
	public void findlow(Grade[] a) {
		int[] lowNum = new int[5];

		for (int i = 0; i < 5; i++) {
			lowNum[i] = Integer.MAX_VALUE;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 5; j++) {
				// if the ID is 0 it stop store low score
				if (lowNum[j] > a[i].getSingleScore(j) && a[i].getSID() != 0) {
					lowNum[j] = a[i].getSingleScore(j);
					lowscores[j] = lowNum[j];
				}
			}
		}

	}

	public void findhigh(Grade[] a) {
		/*
		 * This method will find the highest score and store it in an array
		 * names highscores.
		 */
		int highNum[] = new int[5];

		for (int i = 0; i < 5; i++) {
			highNum[i] = 0;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 5; j++) {
				if (highNum[j] < a[i].getSingleScore(j)) {
					highNum[j] = a[i].getSingleScore(j);
					highscores[j] = highNum[j];
				}
			}
		}
	}

	public void findavg(Grade[] a) {
		/*
		 * This method will find avg score for each quiz and store it in an
		 * array names avgscores.
		 */
		float avg[] = new float[5];
		int q = 0;
		for (int i = 0; i < 5; i++) {
			avg[i] = 0;
		}

		for (int i = 0; i < a.length; i++) {
			avg[0] += a[i].getSingleScore(0);
			avg[1] += a[i].getSingleScore(1);
			avg[2] += a[i].getSingleScore(2);
			avg[3] += a[i].getSingleScore(3);
			avg[4] += a[i].getSingleScore(4);
		}
		// this checks how many actual students in the file
		// if the ID is 0 that means stop increment p
		for (int i = 0; i < a.length; i++) {
			if (a[i].getSID() != 0) {
				q++;
			}
		}
		// we can add entire array of student and divided q
		for (int i = 0; i < 5; i++) {

			avg[i] /= q;
			avgscores[i] = (int) (avg[i] * 100) / 100f;
			// avgscores[i] = (int)(avgscores[i]*100) / 100;
		}
	}

	// Overwrite method from abstract class
	public void printAll() {
		System.out.println("===================================================");
		System.out.println("\t\tClass Scores");
		System.out.println("===================================================");
		System.out.println("\t     L1 L2 L3 L4 L5");
		System.out.print("High Score ");
		for (int i = 0; i < 5; i++) {
			System.out.print(highscores[i] + " ");
		}
		System.out.print("\nLow  Score  ");
		for (int i = 0; i < 5; i++) {
			System.out.print(lowscores[i] + "  ");
		}
		System.out.print("\nAverage Score ");
		for (int i = 0; i < 5; i++) {
			System.out.print(avgscores[i] + " ");
		}
		System.out.println();
	}

	// Overwrite method from interface
	public void printSID() {
	};

	public void printScores() {
	};

}
