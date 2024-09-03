package services;

public class Node {
	
	public String text;
	public Node prev;
	public Node next;
	
	public Node(String text) {
		this.text = text;
		this.prev = null;
		this.next = null;
	}
}
