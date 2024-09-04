package entities;

public class Editor {
	private Manager history;
	private StringBuilder text;
	
	public Editor() {
		history = new Manager();
		text = new StringBuilder();
	}
	
	public void addText(String newText) {
		text.append(newText);
		history.addState(text.toString());
	}
	
	public void removeText(int length) {
		if (length > text.length()) {
            length = text.length();
        }
        text.delete(text.length() - length, text.length());
        history.addState(text.toString());
	}
	
	public void undo() {
        text = new StringBuilder(history.undo());
    }
	
	public void redo() {
        text = new StringBuilder(history.redo());
    }
	
	public String getCurrentText() {
        return text.toString();
    }
}
