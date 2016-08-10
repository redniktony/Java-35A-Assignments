
public class Driver {
	public static void main(String[] args) {
		Human bob = new Human();
		bob.mood = "Teaching";
		Human.count++;
		System.out.println("Human #" + Human.count + " " + bob);
		Human brain = new Human();
		Human.count++;
		System.out.println("Human #" + Human.count + " " + brain);
		// Human bob; is declaring a object name or reference
		// name will contain the address of the created object
		// new Human() - new allocates memory - Human() is call to method to
		// initialize the object (construction)

		// Self contained has all properties and methods to exist on its own
		// Static shared (own copy) Loaded @ StartOfProgram
		// reflection
	}
}