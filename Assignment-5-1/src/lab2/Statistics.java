
//Hua Xia 
//CIS 35A 
//Assignment 5
//Due Date: May 16
//Submit Date: May 17

package lab2;
// Class Statistics is used to get low/high/average scores of the students
public class Statistics {
	private int [] lowscores = new int [5];
  	private int [] highscores = new int [5];
  	private float [] avgscores = new float [5];
  	
  	public int[] getLowscores() {
		return lowscores;
	}

	public void setLowscores(int[] lowscores) {
		this.lowscores = lowscores;
	}

	public int[] getHighscores() {
		return highscores;
	}

	public void setHighscores(int[] highscores) {
		this.highscores = highscores;
	}

	public float[] getAvgscores() {
		return avgscores;
	}

	public void setAvgscores(float[] avgscores) {
		this.avgscores = avgscores;
	}

	public void findlow(Student [] a) {
      	//This method will find lowest score and store it in an array names lowscores
		Integer [] scores = a[0].getScores();
  		for(int i=0; i<5; i++) {
  			lowscores[i] = scores[i];
  		}
  		for(int i=1; i<a.length; i++) {
  			scores = a[i].getScores();
  			for(int j=0; j<5; j++) {
  				if(scores[j] < lowscores[j]) {
  					lowscores[j] = scores[j];
  				}
  			}
  		}
  	}
	
  	public void findhigh(Student [] a){
  		//This method will find highest score and store it in an array names highscores
  		Integer [] scores = a[0].getScores();
  		for(int i=0; i<5; i++) {
  			highscores[i] = scores[i];
  		}
  		for(int i=1; i<a.length; i++) {
  			scores = a[i].getScores();
  			for(int j=0; j<5; j++) {
  				if(scores[j] > highscores[j]) {
  					highscores[j] = scores[j];
  				}
  			}
  		}
  	}

  	public void findavg(Student [] a){
  		//This method will find avg score for each quiz and store it in an array names avgscores
  		Integer [] scores = a[0].getScores();
  		float [] totalscores = {0, 0, 0, 0, 0};
  		for(int i=0; i<a.length; i++) {
  			scores = a[i].getScores();
  			for(int j=0; j<5; j++) {
  				totalscores[j] += scores[j];
  			}
  		}
  		for(int i=0; i<5; i++) {
  			avgscores[i] = totalscores[i]/a.length;
  		}
  	}
  	
  	//add methods to print values of instance variables.
  	void printscores() {
  	//print formatted string
  		System.out.println( "High Score");
  		for(int i=0; i<5; i++) {
  			System.out.println(highscores[i]);
		}
		System.out.println();
		System.out.println("Low Score");
		for(int i=0; i<5; i++) {
			System.out.println(lowscores[i]);
		}
		System.out.println();
		System.out.println("Average");
		for(int i = 0; i < 5; i++){
			System.out.println(avgscores[i]);
		}
		System.out.println();
  	}
}