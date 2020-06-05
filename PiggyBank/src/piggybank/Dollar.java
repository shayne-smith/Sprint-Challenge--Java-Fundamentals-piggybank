package piggybank;

public class Dollar extends AbstractMoney {
	private int numCoins;
	private double faceValue = 1.00;

	public Dollar() {
		numCoins = 1;
	}

	public Dollar(int i) {
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