package edu.handong.csee.java.lab07.prob3;

// Insert all class under the util 
import java.util.*;

/**
 * class Attendance
 * set students information and attendance.
 * 
 * there is four class variable for students information, 
 * two construct for set the students information
 * and one method to set absence number of students.
 *  
 * 
 * @author smile
 *
 */
// Define Class
public class Attendance {
	
	// define class variable. It represent students information.
	String name; // student name
	int studentNumber; // student number
	int grade; // student grade
	int absence; // student absence number
	
	/**
	 * the construct
	 * when user enter the student's information,
	 * save information by entering the information.
	 * 
	 * @param name student's name
	 * @param studeetNumber student's student number
	 * @param grade student's grade(year)
	 * @param absence student's absence number
	 */
	// construct that set the students information
	public Attendance(String name, int grade, int studentNumber, int absence) 
	{
		// Save the input value as the student information.
		this.name = name; // Name is saved in name
		this.studentNumber = studentNumber; // student number is saved in student number 
		this.grade = grade; // grade is saved grade
		this.absence = absence; // absence number is saved absence number
	}
	
	/**
	 * the construct
	 * when user don't enter the student's information,
	 * initialize the student's information. 
	 */
	// construct that initialize the students information
	public Attendance()
	{
		// Initialize the student information
		this.name = "Null"; // Name is saved null.
		this.grade = 0; // grade is saved 0
		this.studentNumber = 0; // student number is saved 0
		this.absence = 0; // absence number is saved 0
	}
	
	/**
	 * method that set absence number!
	 * @param absence
	 */
	// method that set absence number
	public void setAbsence(int absence)
	{
		// set the input value as the number of absence.
		this.absence = absence;
	}

	/**
	 * main program
	 * enter the four student's information,
	 * set the absence number by using random class,
	 * and print out whether a student has fail or not.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Use construct to save the students information
		Attendance stu01 = new Attendance("Jess", 4, 21400999, 0); // set the first student's information 
		Attendance stu02 = new Attendance("Kent", 2, 21700111, 0); // set the second student's information
		Attendance stu03 = new Attendance("Lucas", 1, 21833222, 0); // set the third student's information
		Attendance stu04 = new Attendance("Martha", 2, 21733444, 0); // set the fourth student's information
		
		// Create an object of the Random
		Random randomGen = new Random();
		
		// set the students absence number by using random class.
		stu01.setAbsence(randomGen.nextInt(10)); // set the first student's absence number.
		stu02.setAbsence(randomGen.nextInt(10)); // set the second student's absence number.
		stu03.setAbsence(randomGen.nextInt(10)); // set the third student's absence number.
		stu04.setAbsence(randomGen.nextInt(10)); // set the fourth student's absence number.
		
		// if statement that check the absence number is bigger than 6
		if(stu01.absence > 6) // the case the absence number is bigger than 6
		{	
			// print the result that student fails this lecture.
			System.out.println("I'm Sorry, " + stu01.name + ". You failed this course.");
			// print the student's absence number.
			System.out.println("Your number of absence: " + stu01.absence + "\n");
		}
		else // the case the absence number isn't bigger than 6
			// print the result that student passes this lecture.
			System.out.println("We'll see about grade, " + stu01.name + "\n");
		
		if(stu02.absence > 6) // the case the absence number is bigger than 6
		{
			// print the result that student fails this lecture.
			System.out.println("I'm Sorry, " + stu02.name + ". You failed this course.");
			// print the student's absence number.
			System.out.println("Your number of absence: " + stu02.absence + "\n");
		}
		else // the case the absence number isn't bigger than 6
			// print the result that student passes this lecture.
			System.out.println("We'll see about grade, " + stu02.name + "\n");
		
		if(stu03.absence > 6) // the case the absence number is bigger than 6
		{
			// print the result that student fails this lecture.
			System.out.println("I'm Sorry, " + stu03.name + ". You failed this course.");
			// print the student's absence number.
			System.out.println("Your number of absence: " + stu03.absence + "\n");
		}
		else // the case the absence number isn't bigger than 6
			// print the result that student passes this lecture.
			System.out.println("We'll see about grade, " + stu03.name + "\n");
		
		if(stu04.absence > 6) // the case the absence number is bigger than 6
		{
			// print the result that student fails this lecture.
			System.out.println("I'm Sorry, " + stu04.name + ". You failed this course.");
			// print the student's absence number.
			System.out.println("Your number of absence: " + stu04.absence + "\n");
		}
		else // the case the absence number isn't bigger than 6
			// print the result that student passes this lecture.
			System.out.println("We'll see about grade, " + stu04.name + "\n");
		
	}

}
