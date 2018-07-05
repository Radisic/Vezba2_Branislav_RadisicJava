/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import computer.Computer;
import course.Course;

/**
 *
 * @author banet
 */
public class Student {

	private String firstName;
	private String lastName;
	private int yearOfBirth;
	
	private Course course;
	private Computer computer;
	
	public Student() {
		this.firstName = "Branislav";
		this.lastName = "Radisic";
		this.yearOfBirth = 1900;
	}
	
	public Student(String ime, String prezime, int godina, Course course, Computer computer) {
		
		this.firstName = ime;
		this.lastName = prezime;
		this.yearOfBirth = godina;
		this.course = course;
		this.computer = computer;
	}

	public Course getCourse() {
		return course;
	}

	public Computer getComputer() {
		return computer;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	public void info() {
		System.out.println("First name: " + this.firstName);
		System.out.println("Last name: " + this.lastName);
		System.out.println("Year of birth: " + this.yearOfBirth);
		System.out.println("Course: " + this.course.getName() + ", number of classes: " + this.course.getNumberOfClasses());
		System.out.println("Computer process tact: " + this.computer.getProcessTact() + ", computer memory: " + this.computer.getMemory() + ", computer hard drive: " + this.computer.getHardDrive());
	}
}
