package net.jeremykendall.refactoring.videostore;

public class New_Release extends Movie {

	public New_Release(String title, int priceCode) {
		super(title, priceCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double amount(int daysRented) {
		// TODO Auto-generated method stub
		return daysRented * 3;
	}

}
