package piggybank;

public class Penny extends AbstractMoney {
	private int numCoins;
	private double faceValue = 0.01;

	public Penny() {
		numCoins = 1;
	}

	public Penny(int i) {
		numCoins = i;
	}

	@Override
	public void printValue() {
		System.out.print(numCoins * faceValue);
	}

	@Override
	public void printContents() {
		if (numCoins == 1) {
			System.out.println(numCoins + " Penny");
		} else {
			System.out.println(numCoins + " Pennies");
		}
	}

	@Override
	public double getValue() {
		return numCoins * faceValue;
	}
}