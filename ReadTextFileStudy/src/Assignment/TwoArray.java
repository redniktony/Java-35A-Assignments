package Assignment;

import java.util.Scanner;

public class TwoArray {
	public static void PrintingArrays(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}

	public static void InitalizeArrays(int[][] matrix) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[0].length; column++) {
				matrix[row][column] = input.nextInt();
			}
		}
		PrintingArrays(matrix);
	}

	public static void RandomArrays(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 100);
			}
		}
		PrintingArrays(matrix);
	}

	public static void SummingElements(int[][] matrix) {
		System.out.println("Generate Array Values in Random");
		RandomArrays(matrix);
		int totalforall = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				totalforall += matrix[row][column];
			}
		}
		System.out.println("The All Elements Sum is: " + totalforall);
	}

	public static void SummingByColumn(int[][] matrix) {
		int total = 0;
		System.out.println("Generate Array Values in Random");
		RandomArrays(matrix);
		for (int column = 0; column < matrix[0].length; column++) {
			for (int row = 0; row < matrix.length; row++) {
				total += matrix[row][column];

			}
			System.out.println("Sum for column " + column + " is " + total);
		}
	}

	public static void LargestSum(int[][] matrix) {// largest sum per row
		int maxRow = 0;
		int indexOfMaxRow = 0;
		for (int column = 0; column < matrix[0].length; column++) {
			maxRow += matrix[0][column];
		}
		for (int row = 1; row < matrix.length; row++) {
			int totalOfThisRow = 0;
			for (int column = 0; column < matrix[0].length; column++) {
				totalOfThisRow += matrix[row][column];
				if (totalOfThisRow > maxRow) {
					indexOfMaxRow = row;
					System.out.println(indexOfMaxRow);
				}
			}
		}
	}

	public static void RandomSuffing(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int i1 = (int) (Math.random() * matrix.length);
				int j1 = (int) (Math.random() * matrix[i].length);
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i1][j1];
				matrix[i1][j1] = temp;
			}
		}
	}

	public static char information(char end) {
		System.out.println("Do you want to continue use my program?  (Y/N) ");
		try {
			end = (char) System.in.read();
		} catch (Exception e) {
			System.out.println("Error!!! Please Type Vaild Information!!!!");
		}
		return end;
	}

	public static void main(String[] args) {
		int row, column = 0;
		int choose = 0;
		char end = 'n';
		Scanner input = new Scanner(System.in);
		System.out.println("\t\tProcessing Two Dimensional Arrays");
		System.out.println("=========================================================");
		System.out.println(
				"This is presentation to help student get the better idea \n of learning how to process Two Dimensional Arrays: \n");
		System.out.println(
				"1.Initializing Arrays With Input Values\n2.Initializing Arrays With Random Values\n3.Print Results\n4.Add All Elements In 2 Dimensional Arrays\n5.Add a Column Values Togehter\n6.Finding The Largest Sum Row\n7.Random Shuffling \n");
		System.out.println("Please enter the row you want for your matrix: ");
		row = input.nextInt();
		System.out.println("Please enter the column you want for your matrix:");
		column = input.nextInt();
		int[][] matrix = new int[row][column];
		do {
			System.out.println("Please Enter your Selection:");
			choose = input.nextInt();

			switch (choose) {
			case 1:
				System.out.println("=========================================================");
				System.out.println("Now Presentating Initializing Arrays With Input Values");
				InitalizeArrays(matrix);
				end = information(end);
				break;
			case 2:
				System.out.println("=========================================================");
				System.out.println("Now Presentating Initializing Arrays With Random Values");
				RandomArrays(matrix);
				end = information(end);
				break;
			case 3:
				System.out.println("=========================================================");
				System.out.println("Now Presentating How to Print Results");
				PrintingArrays(matrix);
				end = information(end);
				break;
			case 4:
				System.out.println("=========================================================");
				System.out.println("Now Presentating How to Add All Elements In 2 Dimensional Arrays");
				SummingElements(matrix);
				end = information(end);
				break;
			case 5:
				System.out.println("=========================================================");
				System.out.println("Now Presentating How to Add a Column Values Togehter");
				SummingByColumn(matrix);
				end = information(end);
				break;
			case 6:
				System.out.println("=========================================================");
				System.out.println("Now Presentating Finding The Largest");
				LargestSum(matrix);
				end = information(end);
				break;
			case 7:
				System.out.println("=========================================================");
				System.out.println("Now Presentating Random Shuffling");
				RandomSuffing(matrix);
				end = information(end);
				break;
			default:
				System.out.println("Error...Something Might Wrong...");
			}
		} while (end == 'y' || end == 'Y');
		System.out.println("Thanks for using!");
	}
}
/**
 * class Driver { public static void main(String[] args) { // The name of the
 * file to open. String fileName = "1.txt"; // This will reference one line at a
 * time String line = null; try { // FileReader reads text files in the default
 * encoding. FileReader fileReader = new FileReader(fileName); // Always wrap
 * FileReader in BufferedReader. BufferedReader bufferedReader = new
 * BufferedReader(fileReader); while ((line = bufferedReader.readLine()) !=
 * null) { System.out.println(line); } // Always close files.
 * bufferedReader.close(); } catch (FileNotFoundException ex) {
 * System.out.println("Unable to open file '" + fileName + "'"); } catch
 * (IOException ex) { System.out.println("Error reading file '" + fileName +
 * "'"); // Or we could just do this: // ex.printStackTrace(); } } }
 **/
/**
 * class Driver { public static void main(String[] args) throws IOException{ int
 * count = 0; Scanner input = new Scanner(new File("1.txt"));
 * 
 * System.out.println("hello");
 * 
 * while (input.hasNextInt()) { System.out.print(input.nextInt() + "\t");
 * count++; if (count % 4 == 0) { System.out.println(); } } } }
 **/