package entities;

public class Task {
	public String title;
	public boolean isCompleted;
	public Task next;
	
	public Task(String title) {
		this.title = title;
		this.isCompleted = false;
		this.next = null;
	}
	
	public void markAsCompleted() {
		this.isCompleted = true;
	}

	@Override
	public String toString() {
		return title + ": " + (isCompleted ? " ✔" : " ✘");
	}
}
