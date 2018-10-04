package net.jeremykendall.refactoring.videostore;

public class Regular extends Movie {

	public Regular(String title, int priceCode) {
		super(title, priceCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double amount(int daysRented) {
	 return (daysRented > 2) ? 2 + (daysRented - 2) * 1.5 : 2;
	}

}
