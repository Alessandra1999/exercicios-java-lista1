package entities;

import java.util.LinkedList;
import java.util.Queue;

public class ServicesQueue {

	private Queue<Client> queue;
	
	public ServicesQueue() {
		queue = new LinkedList<>();
	}
	
	public void addClient(Client client) {
		queue.add(client);
		System.out.println(client + " entrou na fila");
	}
	
	public void callNextClient() {
		if (queue.isEmpty()) {
			System.out.println("Não há clientes na fila.");
		} else {
			Client client = queue.poll();
			System.out.println("Atendendo: " + client);
		}
	}
}
