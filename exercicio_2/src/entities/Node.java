package entities;

public class Node {
	
	public String url;
	public Node next;
	
	public Node(String url) {
		this.url = url;
		this.next = null;
	}

	@Override
	public String toString() {
		return url;
	}
	
	
}
