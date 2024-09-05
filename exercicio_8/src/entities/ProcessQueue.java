package entities;

import java.util.LinkedList;
import java.util.Queue;

public class ProcessQueue {

	private Queue<Process> fileQueue;
	
	public ProcessQueue() {
		fileQueue = new LinkedList<>();
	}
	
	public void addProcess(Process process) {
		fileQueue.add(process);
		System.out.println("Processo adicionado: " + process);
	}
	
	public Process removeProcess() {
		if (fileQueue.isEmpty()) {
			System.out.println("A fila está vazia, não há processos para executar.");
			return null;
		}
		
		Process removedProcess = fileQueue.poll();
		System.out.println("Processo removido: " + removedProcess);
		return removedProcess;
	}
	
	public void displayQueue() {
		if (fileQueue.isEmpty()) {
			System.out.println("A fila de processos está vazia.");
		} else {
			System.out.println("Fila de Processos Prontos para Execução:");
            for (Process process : fileQueue) {
                System.out.println(process);
            }
		}
	}
}
