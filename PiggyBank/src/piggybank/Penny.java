package piggybank;

public class Penny extends AbstractMoney {
	private int numCoins;
	private double faceValue = 0.25;

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
	public double getValue() {
		return numCoins * faceValue;
	}
}