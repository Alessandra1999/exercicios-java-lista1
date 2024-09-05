package application;

import entities.Client;
import entities.ServicesQueue;

public class Main {

	public static void main(String[] args) {
		ServicesQueue simulator = new ServicesQueue();

		simulator.addClient(new Client("João", 1));
		simulator.addClient(new Client("Maria", 2));
		simulator.addClient(new Client("José", 3));
		simulator.addClient(new Client("Ana", 4));
		
		simulator.callNextClient();
		simulator.callNextClient();
		simulator.callNextClient();
		simulator.callNextClient();
		simulator.callNextClient();
	}

}
