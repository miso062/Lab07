package edu.handong.csee.java.lab07.prob1;

import java.util.Scanner;
public class YearToCentury {
	
	int year;
	
	public int YearToCen (int year)
	{
		int century=1;

		if(year%100 == 0)
			century = year/100;
		else
			century = year/100 + 1;
			
		return century;
	}

	public static void main(String[] args) {
		
		int year;
		int century;
		
		YearToCentury Year = new YearToCentury();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input year: ");
		year = keyboard.nextInt();
		
		century = Year.YearToCen(year);
		
		System.out.println(year + " is " + century + "th century.");
		
	}

}
