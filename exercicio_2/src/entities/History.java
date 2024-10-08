package entities;

public class History {
	private Node head;
	private Node tail;
	private int size;
	private final int maxSize;
	
	public History(int maxSize) {
		this.head = null;
		this.tail = null;
		this.size = 0;
		this.maxSize = maxSize;
	}
	
	public void addUrl(String url) {
		Node newNode = new Node(url);
		
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		
		size++;
		
		if (size > maxSize) {
			removeOldestUrl();
		}
		
		System.out.println("Url " + url + " adicionada com sucesso.");
	}
	
	private void removeOldestUrl() {
		if (head != null) {
			System.out.println("O tamanho máximo foi atingido, a url mais antiga " + head.url + " será removida");
			head = head.next;
			size--;
		}
	}
	
	public void displayHistory() {
		if (head == null) {
			System.out.println("O histórico de navegação está vazio.");
			return;
		}
		
		Node current = head;
		System.out.println("Histórico de Navegação: ");
		while (current != null) {
			System.out.println(current.url);
			current = current.next;
		}
	}
}
