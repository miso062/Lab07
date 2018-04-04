package edu.handong.csee.java.lab07.prob3;

import java.util.*;
public class Attendance {
	
	String name;
	int studentNumber;
	int grade;
	int absence;
	
	public Attendance(String name, int studnetNumber, int grade, int absence) 
	{
		this.name = name;
		this.studentNumber = studnetNumber;
		this.grade = grade;
		this.absence = absence;
	}
	
	public Attendance()
	{
		this.name = "Null";
		this.grade = 0;
		this.studentNumber = 0;
		this.absence = 0;
	}
	
	public void setAbsence(int absence)
	{
		this.absence = absence;
	}

	public static void main(String[] args) {
		
		Attendance stu01 = new Attendance("Jess", 4, 21400999, 0);
		Attendance stu02 = new Attendance("Kent", 2, 21700111, 0);
		Attendance stu03 = new Attendance("Lucas", 1, 21833222, 0);
		Attendance stu04 = new Attendance("Martha", 2, 21733444, 0);
		
		Random randomGen = new Random();
		
		stu01.setAbsence(randomGen.nextInt(10));
		stu02.setAbsence(randomGen.nextInt(10));
		stu03.setAbsence(randomGen.nextInt(10));
		stu04.setAbsence(randomGen.nextInt(10));
		
		if(stu01.absence > 6)
		{	System.out.println("I'm Sorry, " + stu01.name + ". You failed this course.");
			System.out.println("Your number of absence: " + stu01.absence + "\n");
		}
		else
			System.out.println("We'll see about grade, " + stu01.name + "\n");
		
		if(stu02.absence > 6)
		{
			System.out.println("I'm Sorry, " + stu02.name + ". You failed this course.");
			System.out.println("Your number of absence: " + stu02.absence + "\n");
		}
		else
			System.out.println("We'll see about grade, " + stu02.name + "\n");
		
		if(stu03.absence > 6)
		{
			System.out.println("I'm Sorry, " + stu03.name + ". You failed this course.");
			System.out.println("Your number of absence: " + stu03.absence + "\n");
		}
		else
			System.out.println("We'll see about grade, " + stu03.name + "\n");
		
		if(stu04.absence > 6)
		{
			System.out.println("I'm Sorry, " + stu04.name + ". You failed this course.");
			System.out.println("Your number of absence: " + stu04.absence + "\n");
		}
		else
			System.out.println("We'll see about grade, " + stu04.name + "\n");
		
	}

}
