//Hua Xia 
//CIS 35A 
//Assignment 5
//Due Date: May 16
//Submit Date: May 17

package Lab2Util;

import java.io.*;
import java.util.*;

import CustomerException.MoreStudentsException;
import lab2.Student;

public class Util {
	@SuppressWarnings("resource")
	public static Student [] readFile(String filename, Student [] stu){
		//Reads the file and builds student array.
		String s;
		int studentNum = 0;
		//Open the file using FileReader Object.
		File studentInfo = new File(filename);
		//In a loop read a line using readLine method.
		try {
			FileReader fr = new FileReader(studentInfo);
			BufferedReader br = new BufferedReader(fr);
			//to remove the header
			br.readLine();
			while ((s = br.readLine()) != null) {
				//ignore blank line
				if(s.length() == 0) {
					continue;
				}
				//if students number exceeds 40, only count 40 students and throw an exception
				if(studentNum == 40) {
					throw new MoreStudentsException();
				}
				//Analyze each line using StringTokenizer Object
				StringTokenizer st = new StringTokenizer(s);
				Integer[] scores = new Integer[5];
				stu[studentNum] = new Student();
				for(int i=0; st.hasMoreTokens(); i++) {
					String tmp = st.nextToken();
					int score, SID;
					//Each token is converted from String to Integer using parseInt method
					if(i == 0){ //to get Student ID in each line
						SID = Integer.parseInt(tmp);
						stu[studentNum].setSID(SID);
					}
					else { //to get score for each course
						score = Integer.parseInt(tmp);
						scores[i-1] = score;
					}
				}
				//Value is then saved in the right property of Student Object.
				stu[studentNum].setScores(scores);
				studentNum++;
			}
			fr.close();
		} 
		catch(MoreStudentsException e){
			e.printProblems();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		Student [] student = new Student[studentNum]; 
		for(int i=0; i<studentNum; i++) {
			student[i] = stu[i];
		}
		return student;
	}
}