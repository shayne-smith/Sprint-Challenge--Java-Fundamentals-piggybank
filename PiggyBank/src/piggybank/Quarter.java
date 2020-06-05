package piggybank;

public class Quarter extends AbstractMoney {
	private int numCoins;
	private double faceValue = 0.25;

	public Quarter() {
		numCoins = 1;
	}

	public Quarter(int i) {
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