package services;

public class Node {
	public ActionType actionType;
	public String text;
	public Node next;
	
	public Node(ActionType actionType, String text) {
		this.actionType = actionType;
		this.text = text;
		this.next = null;
	}
	
	@Override
    public String toString() {
        return actionType + ": " + text;
    }
}
