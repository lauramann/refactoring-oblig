package net.jeremykendall.refactoring.videostore;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();
    private int frequentRenterPoints = 0;

    public Customer(String name) {
        _name = name;
    }

    public String statement() {
        double totalAmount = 0;
        
        Enumeration rentals = _rentals.elements();
        String result = "";
        
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            double thisAmount = each.getMovie().amount(each.getDaysRented());
            int priceCode = each.getMovie().getPriceCode();
            
            addFrequentRenterPoints();
            
            // add bonus for a two day new release rental
            if (priceCode == Movie.NEW_RELEASE && each.getDaysRented() > 1) addFrequentRenterPoints();

            //show figures for this rental
            result +=getRentalFigures(each.getMovie().getTitle(), thisAmount);
            
            totalAmount += thisAmount;     
        }
        
        return getResult(getName(), result, totalAmount, frequentRenterPoints);
    }
    
    private String getRentalFigures(String title, double amount) {
    	return "\t" + title + "\t" + String.valueOf(amount) + "\n";
    }
    
    private String getResult(String name, String result, double total, int points) {
    	return "Rental Record for " + name + "\n" + result + "Amount owed is " + String.valueOf(total) + "\n" + "You earned " + String.valueOf(points) +
                " frequent renter points";
    }
    
    private void addFrequentRenterPoints() {
    	frequentRenterPoints ++ ;
    }
    

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }
}
