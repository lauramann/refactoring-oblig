package net.jeremykendall.refactoring.videostore;

public class Childrens extends Movie {

	public Childrens(String title, int priceCode) {
		super(title, priceCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double amount(int daysRented) {
		// TODO Auto-generated method stub
		return (daysRented > 3) ? 1.5 + (daysRented - 3) * 1.5 : 1.5;
	}

}
