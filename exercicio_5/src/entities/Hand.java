package entities;

public class Hand {
	private Node head;
	private Node tail;
	
	public Hand() {
		this.head = null;
		this.tail = null;
	}
	
	public void addCard(Card card) {
		Node newNode = new Node(card);
		
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		
		System.out.println(card + " adicionado!");
	}
	
	public void removeCard(String value, String suit) {
		Node current = head;
		
		while (current != null) {
			if (current.card.getValue().equals(value) && current.card.getSuit().equals(suit)) {
				if (current.prev != null) {
					current.prev.next = current.next;
				} else {
					head = current.next;
				}
				if (current.next != null) {
					current.next.prev = current.prev;
				} else {
					tail = current.prev;
				}
				System.out.println(current.card + " removido!");
				return;
			}
			current = current.next;
		}
		System.out.println(value + " de " + suit + "não encontrado");
	}
	
	public void moveCard(String value, String suit, int newPosition) {
		Node current = head;
		Node targetNode = null;
		int index = 0;
		
		while (current != null) {
			if (current.card.getValue().equals(value) && current.card.getSuit().equals(suit)) {
				targetNode = current;
				break;
			}
			current = current.next;
			index++;
		}
		
		if (targetNode == null) {
			System.out.println(value + " de " + suit + "não encontrado");
			return;
		}
		
		if (targetNode.prev != null) {
			targetNode.prev.next = targetNode.next;
		} else {
			tail = targetNode.prev;
		}
		
		current = head;
		int currentIndex = 0;
		while (current != null && currentIndex < newPosition) {
			current = current.next;
			currentIndex++;
		}
		
		if (current == null) {
			addCard(targetNode.card);
		} else {
			targetNode.next = current;
            targetNode.prev = current.prev;
            if (current.prev != null) {
            	current.prev.next = targetNode;
            } else {
            	head = targetNode;
            }
            current.prev = targetNode;
		}
		
		System.out.println(targetNode.card + " movido para a posição " + newPosition);
	}
	
	public void showHand() {
		Node current = head;
		
		if (current == null) {
			System.out.println("Não há cartas para mostrar!");
		} else {
		System.out.println("Cartas na mão:");
		}
		while (current != null) {
			System.out.println(current.card);
			current = current.next;
		}
	}
}
