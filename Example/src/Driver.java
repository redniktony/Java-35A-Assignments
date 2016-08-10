public class Driver {
	public static void main(String[] a) {
		Battery nokia = new Battery();
		Android samsung = new Android();
		samsung.powerup(nokia);
		Iphone bobsphone = new Iphone();
		bobsphone.powerup();
	}
}