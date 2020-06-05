package piggybank;

public class Dime extends AbstractMoney {
	private int numCoins;
	private double faceValue = 0.10;

	public Dime() {
		numCoins = 1;
	}

	public Dime(int i) {
		numCoins = i;
	}

	@Override
	public void printValue() {
		System.out.print(numCoins * faceValue);
	}

	@Override
	public void printContents() {
		if (numCoins == 1) {
			System.out.println(numCoins + " Dime");
		} else {
			System.out.println(numCoins + " Dimes");
		}
	}

	@Override
	public double getValue() {
		return numCoins * faceValue;
	}
}