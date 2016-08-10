import java.lang.*;
//import java.util.Scanner;
import java.util.*;//This might using to slow down your computer

public class HelloWorld {
	public static void main(String[] args) {
		Scanner a1 = new Scanner(System.in);
		System.out.println("Please enter a value (e.g.200.02)");
		int x = a1.nextInt();
		System.out.println(x);
		float a2 = a1.nextFloat();
		System.out.println(a2);
		String a3 = a1.next();
		System.out.println(a3); // This is to capture the string
		System.out.println(x + "ha ha you stupid" + "another value " + a2);
		System.out.println();
	}
}