package entities;

public class Node {
	public Card card;
	public Node prev;
	public Node next;
	
	public Node(Card card) {
		this.card = card;
		this.prev = null;
		this.next = null;
	}
}
