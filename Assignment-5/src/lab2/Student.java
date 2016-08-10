package lab2;

import java.io.*;

class Student {
	private int SID;
	private int[] scores = new int[5];

	// write public get and set methods for
	public int getSID() {
		return SID;
	}

	public void setSID(int SID) {
		this.SID = SID;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	// SID and scores
	public String Print() {
		Student[] students = new Student[5];
		for (int i = 0; i < students.length; i++) {
			return ("Student ID: " + this.SID + "Scores" + this.scores);
		}
		return ("Student ID: " + this.SID + "Scores" + this.scores);
	}
	// add methods to print values of instance variables.

}