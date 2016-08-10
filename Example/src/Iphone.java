public class Iphone {
	private Battery b1; // containment - When an object is
	private boolean Poweredup;

	// instantiated in another object.

	Iphone() {
		b1 = new Battery(); // strong association - containment.
	}

	// Iphone is garbage collected then battery is also garbage collected at the
	// same time.
	Iphone(Battery b1) {
		this.b1 = b1; // weak association -
	}

	// Iphone is garbage collected - battery is not.
	public void powerup() {
		if (b1 != null) {
			int charge = b1.getCharge();
			System.out.printf("Charge=%d\n", charge);
			if (charge > 0) {
				Poweredup = true;
				b1.setCharge(charge--);
				System.out.printf("Charge=%d\n", charge);
				System.out.printf("Phone on!\n");
			} else
				System.out.printf("Bad Battery\n");
		} else
			System.out.printf("Ha ha - you got an iphone without a battery!");

	}
}