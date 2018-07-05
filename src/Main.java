
import computer.Computer;
import course.Course;
import student.Student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author banet
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course c1 = new Course("Programiranje", 200);
		Computer comp1 = new Computer(3.1, 32.0, 256);
		
		Student stud1 = new Student("Branislav", "Radisic", 1985, c1, comp1);
		stud1.info();
    }
    
}
