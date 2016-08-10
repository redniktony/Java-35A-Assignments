
public class ReadSource {
	public static void main(String[] arguments) {
		try {
			FileReader file = new FileReader("ReadSource.java");
			BufferedReader buff = new BufferedReader(file);
			boolean eof = false;
			while (!eof) {
				String line = buff.readLine();
				if (line == null)
					eof = true;
				else
					System.out.println(line);
			}
			buff.close();
		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}
	}}

	// How do you tokenize a String? You can use other ways of doing this, if
	// you like.
	StringTokenizer st = new StringTokenizer("this is a test");while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
}

// How to convert a String to an Integer
//int x = Integer.parseInt(String) ;
