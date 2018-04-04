package edu.handong.csee.java.lab07.prob2;

/**
 * class Chicken
 * set the chicken menu's name, price, and rating.
 * 
 * there are three private variable to represent chicken menu's information,
 * one constructor for set the chicken menu's information,
 * and six method to get or set chicken menu's information
 * 
 * @author smile
 *
 */
public class Chicken {
	
	// define private class variable.
	private String name; // chicken menu name
	private double price; // chicken menu price
	private int rating; // chicken menu rating
	
	/**
	 * the construct
	 * when user enter the chicken's information,
	 * save information by entering the information.
	 * 
	 * @param name
	 * @param price
	 * @param rating
	 */
	// construct that set the chicken menu's information
	public Chicken (String name, double price, int rating)
	{
		// Save the input value as the student information.
		this.name = name; // Name is saved in name
		this.price = price; // price is saved in price
		this.rating = rating; // Rating is save in rating
	}
	
	/**
	 * method that set chicken name
	 * @param name
	 */
	// method that set chicken name
	public void setName(String name)
	{
		// set the input value as name.
		this.name = name;
	}
	
	/**
	 * method that set chicken price
	 * @param price
	 */
	// method that set chicken price
	public void setPrice(double price)
	{
		// set the input value as price.
		this.price = price;
	}
	
	/**
	 * method that set chicken rating
	 * @param rating
	 */
	// method that set chicken rating
	public void setRating(int rating)
	{
		// set the input value as rating.
		this.rating = rating;
	}
	
	/**
	 * method that get chicken name
	 * @return chicken's name
	 */
	// method that get chicken name
	public String getName()
	{
		// return the chicken menu's name
		return this.name;
	}
	
	/**
	 * method that get chicken price
	 * @return chicken's price
	 */
	// method that get chicken price
	public double getPrice()
	{
		// return the chicken menu's price
		return this.price;
	}
	
	/**
	 * method that get chicken rating
	 * @return chicken's rating
	 */
	// method that get chicken rating
	public int getRating()
	{
		// return the chicken menu's rating
		return this.rating;
	}
	
	/**
	 * main program
	 * 
	 * enter the three chicken menu's information,
	 * and print out menu's name and rating.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Use construct to save the chicken mune's information
		Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 3); // set the first chicken menu's information 
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 4); // set the second chicken menu's information
		Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1); // set the third chicken menu's information
		
		// print the menu's name and rating
		System.out.println(menu1.getName() + "'s rating is " + menu1.getRating()); // first chicken's name and rating
		System.out.println(menu2.getName() + "'s rating is " + menu2.getRating()); // second chicken's name and rating
		System.out.println(menu3.getName() + "'s rating is " + menu3.getRating()); // third chicken's name and rating
		
	}
}
