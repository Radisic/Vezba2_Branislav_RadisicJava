/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

/**
 *
 * @author banet
 */
public class Computer {
    private double processTact;
	private double memory;
	private int hardDrive;
	
	public Computer() {
		this.processTact = 2.4;
		this.memory = 16.0;
		this.hardDrive = 500;
	}
	
	public Computer(double tact, double memory, int hard) {
		this.processTact = tact;
		this.memory = memory;
		this.hardDrive = hard;
	}

	public double getProcessTact() {
		return processTact;
	}

	public void setProcessTact(double processTact) {
		this.processTact = processTact;
	}

	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
	}

	public int getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(int hardDrive) {
		this.hardDrive = hardDrive;
	}
	
    
}
