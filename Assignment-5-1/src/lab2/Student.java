//Hua Xia 
//CIS 35A 
//Assignment 5
//Due Date: May 15
//Submit Date: May 17

package lab2;

abstract class  StudentAbstract
{
	private Integer SID;
	private Integer scores[] = new Integer[5];
	
	//use default access modifier
	public StudentAbstract(){}
	public StudentAbstract(int SID, int[] scores){
		this.SID = SID;
		
		for(int i=0; i<5; i++){
			this.scores[i] = scores[i];
		}
	}
	
	//write public get and set methods for SID and scores
	public Integer getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	public Integer[] getScores() {
		return scores;
	}
	public void setScores(Integer[] scores) {
		this.scores = scores;
	}
	public abstract void printInfo();
}

public class Student extends StudentAbstract {		
	//add methods to print values of instance variables.
	public void printInfo(){
		//print formatted string
		System.out.println(getSID());
		for(int i = 0; i < 5; i++){
			System.out.println( getScores()[i]);
		}
		System.out.println();
	}
}