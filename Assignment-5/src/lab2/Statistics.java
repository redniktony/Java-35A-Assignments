package lab2;
class Statistics {
	static int[] lowscores = new int[5];
	static int[] highscores = new int[5];
	static float[] avgscores = new float[5];

	static void findlow(Student[] a) {
		/*
		 * This method will find the lowest score and store it in an array names
		 * lowscores.
		 */
		int[] scores = a[0].getScores();
		for (int i = 0; i < 5; i++) {
			lowscores[i] = scores[i];
		}
		for (int i = 1; i < a.length; i++) {
			scores = a[i].getScores();
			for (int j = 0; j < 5; j++) {
				if (scores[j] < lowscores[j]) {
					lowscores[j] = scores[j];
				}
			}
		}
	}

	static void findhigh(Student[] a) {
		/*
		 * This method will find the highest score and store it in an array
		 * names highscores.
		 */
		int[] scores = a[0].getScores();
		for (int i = 0; i < 5; i++) {
			highscores[i] = scores[i];
		}
		for (int i = 1; i < a.length; i++) {
			scores = a[i].getScores();
			for (int j = 0; j < 5; j++) {
				if (scores[j] > highscores[j]) {
					highscores[j] = scores[j];
				}
			}
		}
	}

	static void findavg(Student[] a) {
		/*
		 * This method will find avg score for each quiz and store it in an
		 * array names avgscores.
		 */

		int[] scores = a[0].getScores();
		float[] totalscores = { 0, 0, 0, 0, 0 };
		for (int i = 0; i < a.length; i++) {
			scores = a[i].getScores();
			for (int j = 0; j < 5; j++) {
				totalscores[j] += scores[j];
			}
		}
		for (int i = 0; i < 5; i++) {
			avgscores[i] = totalscores[i] / a.length;
		}
	}
	// add methods to print values of instance variables.
}
