package application;

import entities.PrintJob;
import entities.PrinterQueue;

public class Main {

	public static void main(String[] args) {
		PrinterQueue printerSimulator = new PrinterQueue();
		
		printerSimulator.addJob(new PrintJob(1, "Documento A"));
		printerSimulator.addJob(new PrintJob(2, "Documento B"));
		printerSimulator.addJob(new PrintJob(3, "Documento C"));
		
		printerSimulator.displayQueue();
		
		printerSimulator.processNextJob();
		printerSimulator.processNextJob();
		
		printerSimulator.displayQueue();
		
		printerSimulator.processNextJob();
		
		printerSimulator.processNextJob();
	}

}
