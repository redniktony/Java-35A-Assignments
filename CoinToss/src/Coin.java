//Hua Xia
//CIS 35A Spring 2016
//Assignment 2
//Due Date April 25th
//Date Submitted April 25th

public class Coin {

	private String sideUp;

	public void setSideUp(String sideUp) {
		this.sideUp = sideUp;
	}

	public String getSideUp() {
		return sideUp;
	}

	public Coin() {
		Simulate a1 = new Simulate();
		this.sideUp = a1.toss();
	}
}
