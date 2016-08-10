public class Android {
	private boolean Poweredup;

	Android() {
	}

	public Android(boolean poweredup) {
		Poweredup = poweredup;
	}

	public void powerup(Battery a1) {
		int charge = a1.getCharge();
		System.out.printf("Charge=%d\n", charge);
		if (charge > 0) {
			Poweredup = true;
			a1.setCharge(charge--);
			System.out.printf("Charge=%d\n", charge);
			System.out.printf("Phone on!\n");
		} else
			System.out.printf("Bad Battery\n");
	}
}
