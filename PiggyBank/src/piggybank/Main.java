package piggybank;

import java.util.List;
import java.util.ArrayList;

public class Main {
	private static double totalValue = 0;

	public static void main(String[] args) {
		System.out.println("*** Welcome to Java Piggy Bank!!\n");

		List<AbstractMoney> piggyBank = new ArrayList<>();

		piggyBank.add(new Quarter());
		piggyBank.add(new Dime());
		piggyBank.add(new Dollar(5));
		piggyBank.add(new Nickel(3));
		piggyBank.add(new Dime(7));
		piggyBank.add(new Dollar());
		piggyBank.add(new Penny(10));

		for (AbstractMoney m : piggyBank) {
			m.printContents();
			totalValue += m.getValue();
		}

		System.out.printf("\nThe piggy bank holds $%3.2f", totalValue);
	}
}