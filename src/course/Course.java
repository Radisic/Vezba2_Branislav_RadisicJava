/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

/**
 *
 * @author banet
 */
public class Course {
    private String name;
	private int numberOfClasses;
	
	public Course() {
		this.name = "Softversko inzenjerstvo";
		this.numberOfClasses = 1000;
	}
	
	public Course(String name, int number) {
		this.name = name;
		this.numberOfClasses = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfClasses() {
		return numberOfClasses;
	}

	public void setNumberOfClasses(int numberOfClasses) {
		this.numberOfClasses = numberOfClasses;
	}
	
	public void info() {
		
	}
    
}
