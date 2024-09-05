package entities;

import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {

	private Queue<PrintJob> printQueue;
	
	public PrinterQueue() {
		printQueue = new LinkedList<>();
	}
	
	public void addJob(PrintJob job) {
		printQueue.add(job);
		System.out.println("Adicionado à fila: " + job);
	}
	
	public void processNextJob() {
		if (printQueue.isEmpty()) {
			System.out.println("Não há trabalhos na fila para processar.");
		} else {
			PrintJob job = printQueue.poll();
			System.out.println("Processando: " + job);
		}
	}
	
	public void displayQueue() {
		if (printQueue.isEmpty()) {
			System.out.println("A fila de impressão está vazia.");
		} else {
			System.out.println("Trabalhos na fila:");
            for (PrintJob job : printQueue) {
                System.out.println(job);
            }
		}
	}
}
