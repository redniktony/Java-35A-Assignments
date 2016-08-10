package lab2; 

//Hua Xia
//CIS 35A 
//Assignment 6
//Due Date:June 6
//Submit Date: June 10

// abstract class
public abstract class Grade {
	private int scores[] = new int[5];

	public abstract void printAll();

	// -----------------------getter and setter------------------------------
	public int[] getScores() {
		return scores;
	}

	public int getSingleScore(int i) {
		return scores[i];
	}

	public void setScores(int[] scores) {
		for (int i = 0; i < this.scores.length; i++) {
			this.scores[i] = scores[i];
		}
	}
	// -----------------------getter and setter------------------------------

	public void setSID(int a) {
	}

	public int getSID() {
		return 0;
	}

	public int SIDForScores(int a) {
		return 0;
	};
}
