package services;

public class Editor {
	private StringBuilder currentText;
	private Node head;
	private int actionCount;
	
	public Editor() {
		this.currentText = new StringBuilder();
		this.head = null;
		this.actionCount = 0;
	}
	
	public void insertText(String text) {
		currentText.append(text);
		addAction(ActionType.INSERT, text);
		System.out.println("Texto '" + text + "' inserido com sucesso!");
	}
	
	public void deleteText(int length) {
		if (length <= 0 || length > currentText.length()) {
			System.out.println("Operação de remoção inválida.");
			return;
		}
		
		String deletedText = currentText.substring(currentText.length() - length);
		currentText.delete(currentText.length() - length, currentText.length());
		addAction(ActionType.DELETE, deletedText);
		System.out.println("Texto '" + deletedText + "' removido com sucesso!");
	}
	
	private void addAction(ActionType actionType, String text) {
        Node newNode = new Node(actionType, text);
        newNode.next = head;
        head = newNode;
        actionCount++;
    }
	
	public void undo() {
		if (head == null) {
			System.out.println("Não há ações para desfazer!");
			return;
		}
		
		Node lastAction = head;
		head = head.next;
		actionCount--;
		
		if (lastAction.actionType == ActionType.INSERT) {
			currentText.delete(currentText.length() - lastAction.text.length(), currentText.length());
			System.out.println("Inserção desfeita: " + lastAction.text);
		} else if (lastAction.actionType == ActionType.DELETE) {
			currentText.append(lastAction.text);
			System.out.println("Remoção desfeita: " + lastAction.text);
		}
	}
	
	public void displayText() {
		System.out.println("Texto atual: " + currentText.toString());
	}
	
	public void displayActions() {
		if (head == null) {
			System.out.println("Nenhuma ação foi realizada.");
			return;
		}
		
		Node current = head;
		System.out.println("Ações realizadas: ");
		while (current != null) {
			System.out.println(current);
			current = current.next;
		}
	}
}
