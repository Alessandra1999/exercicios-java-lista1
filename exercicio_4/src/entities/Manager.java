package entities;

public class Manager {
	
	private Node head;
	private Node current;
	
	public Manager() {
		head = new Node("");
		current = head;
	}
	
	public void addState(String text) {
		Node newNode = new Node(text);
		newNode.prev = current;
		current.next = newNode;
		current = newNode;
	}
	
	public String undo() {
		if (current.prev != null) {
			current = current.prev;
		}
		
		return current.text;
	}
	
	public String redo() {
		if (current.next != null) {
			current = current.next;
		}
		
		return current.text;
	}
	
	public String getCurrentText() {
		return current.text;
	}
}
