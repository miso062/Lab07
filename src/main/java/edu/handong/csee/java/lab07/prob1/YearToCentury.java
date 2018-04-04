package edu.handong.csee.java.lab07.prob1;

// Insert Scanner
import java.util.Scanner;

/**
 * class YearToCentury
 * get the year calculates the century given a year.
 * 
 * there is a one class variable
 * and one method to calculate the century.
 * 
 * @author smile
 *
 */
public class YearToCentury {
	
	// define class variable
	int year; // year that will be calculated.
	
	/**
	 * method YearToCen
	 * get the year value and calculate the century given a year.
	 * 
	 * @param year
	 * @return calculated century value.
	 */
	// method that calculate the century given a year
	public int YearToCen (int year)
	{
		// insert integer variable century
		int century;

		// if statement to check the year divided into 100.
		if(year%100 == 0) // there is no remainder.
			// put value that divide the year by 100 into century
			century = year/100;
		else // there is remainder.
			// put value that divide the year by 100 and add 1 into century
			century = year/100 + 1;
		
		// return century
		return century;
	}

	/**
	 * main program
	 * 
	 * get year from user,
	 * calculate the century given the year,
	 * and print out the century.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// define integer variable
		int year; // year that user want to calculate.
		int century; // calculated century value.
		
		// Instantiate an object of class YearToCentury
		YearToCentury Year = new YearToCentury();
		// Create an object of the Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Use the println to get the year from user.
		System.out.println("Input year: ");
		// save the entered number as year.
		year = keyboard.nextInt();
		
		// calculate the century by calling the YearToCen method and put the value into century.
		century = Year.YearToCen(year);
		
		// print out the year and the century.
		System.out.println(year + " is " + century + "th century.");
		
	}

}
