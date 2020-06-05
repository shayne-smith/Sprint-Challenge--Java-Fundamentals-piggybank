package piggybank;

public class Nickel extends AbstractMoney {
	private int numCoins;
	private double faceValue = 0.05;

	public Nickel() {
		numCoins = 1;
	}

	public Nickel(int i) {
		numCoins = i;
	}

	@Override
	public void printValue() {
		System.out.print(numCoins * faceValue);
	}

	@Override
	public void printContents() {
		if (numCoins == 1) {
			System.out.println(numCoins + " Nickel");
		} else {
			System.out.println(numCoins + " Nickels");
		}
	}

	@Override
	public double getValue() {
		return numCoins * faceValue;
	}
}