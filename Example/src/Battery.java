public class Battery {
	private int charge;

	Battery() {
		charge = 100;
	}

	public Battery(int charge) {
		this.charge = charge;
	}

	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

}
