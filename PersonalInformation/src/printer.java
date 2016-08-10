//Hua Xia
//CIS 35A Spring 2016
//Assignment 2
//Due Date April 25th
//Date Submitted April 25th
import java.util.Scanner;

public class printer {
	Scanner input = new Scanner(System.in);

	void printInformation(InfoTable s1) {
		System.out.println("Please Enter Your Name: (Please replace space with '_')");
		s1.setName(input.next());
		System.out.println("Please Enter Your Address: (Please replace space with '_')");
		s1.setAddress(input.next());
		System.out.println("Please Enter Your Age: ");
		s1.setAge(input.nextInt());
		System.out.println("Please Enter Your Phone Number: ");
		s1.setPnumber(input.nextLong());

		System.out.println("Your information is" + "\n" + "----------------------------------------------------------");
		System.out.println("Name: " + s1.getName());
		System.out.println("Age: " + s1.getAge());
		System.out.println("Address: " + s1.getAddress());
		System.out.println("Phone Number: " + s1.getPnumber());
	}
}
