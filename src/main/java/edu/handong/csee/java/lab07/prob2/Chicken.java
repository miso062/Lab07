package edu.handong.csee.java.lab07.prob2;

public class Chicken {
	
	private String name;
	private double price;
	private int rating;
	
	public Chicken (String name, double price, int rating)
	{
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public void setRating(int rating)
	{
		this.rating = rating;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public int getRating()
	{
		return this.rating;
	}
	
	public static void main(String[] args) {
		
		Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 3);
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 4);
		Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);
		
		System.out.println(menu1.getName() + "'s rating is " + menu1.getRating());
		System.out.println(menu2.getName() + "'s rating is " + menu2.getRating());
		System.out.println(menu3.getName() + "'s rating is " + menu3.getRating());
		
	}
}
