package piggybank;

abstract class AbstractMoney {
	protected int numCoins;

	public AbstractMoney() {
		numCoins = 1;
	}

	abstract void printValue();
	abstract void printContents();
	abstract double getValue();
}