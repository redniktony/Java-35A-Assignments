package Lab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReadSource {
	public static void main(String[] arguments) {
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Your File Name: ");
		String filename= input.next();
		String workingDirectory = System.getProperty("user.dir");
		String absoluteFilePath = "";	
		absoluteFilePath = workingDirectory + File.separator + filename;
		
		
		
		try {
			FileReader file = new FileReader(absoluteFilePath);
			BufferedReader buff = new BufferedReader(file);
			
			boolean eof = false;
			
			while (!eof) {
				
				String line = buff.readLine();
				StringTokenizer st = new StringTokenizer(line);
			    while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
			     }
			    //int x = Integer.parseInt(String);
			    
				//if (line == null)
					//eof = true;
				//else
					//System.out.println(line);
			}
			file.close();
			buff.close();
		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}
		
	}
}
