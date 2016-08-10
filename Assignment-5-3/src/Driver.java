import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) {
		Student lab6[] = new Student[40];
		// Populate the student array
		for (int i = 0; i < 40; i++) {
			lab6[i] = new Student();
		}

		lab6 = Util.readFile("Readdata.txt", lab6);

		for (int row = 0; row < Util.numOfStudent; row++) {
			Student.printInfo(lab6[row]);
		}

		// show the results of data
		Statistics statlab6 = new Statistics();
		statlab6.findLow(lab6);
		statlab6.findHigh(lab6);
		statlab6.findAvg(lab6);
		System.out.println();
		statlab6.printLow();
		statlab6.printHigh();
		statlab6.printAvg();

		// serialization
		try {
			// opening file
			FileOutputStream fileOut = new FileOutputStream("C:/Users/Lucille/workspace/Lab_6/students.ser");

			// write data into file
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			for (int i = 0; i < 40; i++) {
				out.writeObject(lab6[i]); // writing each student data
			}
			// closing file and object output streams
			out.close();
			fileOut.close();
			System.out.printf("file is successfully saved");
		} catch (IOException i) { // catch
			i.printStackTrace();
		}
	}
}