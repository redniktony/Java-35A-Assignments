import java.io.Serializable;

//Lucille Cao
//CIS 35A 
//Assignment 6
//Due Date: May 30
//Submit Date: June 9

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int SID;
	private int scores[] = new int[5];

	// constructor,getters and setters
	public Student() {
	}

	public int getSID() {
		return SID;
	}

	public void setSID(int SID) {
		this.SID = SID;
	}

	public int getScores(int numOfQuiz) {
		return scores[numOfQuiz];
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	public void recordScores(int[] scores) {
		for (int i = 0; i < 5; i++) {
			this.scores[i] = scores[i];
		}
	}

	
	// print out data file
	public static void printInfo(Student stu) {
		System.out.println("Stud Qu1 Qu2 Qu3 Qu4 Qu5");
		System.out.printf("%d ", stu.getSID());
		for (int i = 0; i < 5; i++) {
			System.out.printf("%3d ", stu.getScores(i));
		}
		System.out.println();
	}
}