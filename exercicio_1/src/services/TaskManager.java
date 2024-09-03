package services;

public class TaskManager {

	private Task head;
	
	public void addTask(String title) {
		Task newTask = new Task(title);
		
		if (head == null) {
			head = newTask;
		} else {
			Task current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newTask;
		}
		System.out.println("Tarefa '" + title + "' adicionada com sucesso.");
	}
	
	public void removeTask(int index) {
		if (head == null) {
			System.out.println("A lista de tarefas está vazia.");
			return;
		}
		
		if (index == 0) {
			head = head.next;
			System.out.println("Tarefa removida com sucesso.");
			return;
		}
		
		Task current = head;
		Task previous = null;
		int count = 0;
		
		while (current != null && count < index) {
			previous = current;
			current = current.next;
			count++;
		}
		
		if (current == null) {
			System.out.println("Índice inválido.");
			return;
		}
		
		previous.next = current.next;
		System.out.println("Tarefa removida com sucesso.");
	}
	
	public void markTaskAsCompleted(int index) {
		Task current = head;
		int count = 0;
		
		while (current != null) {
            if (count == index) {
                current.markAsCompleted();
                System.out.println("Tarefa marcada como concluída.");
                return;
            }
            current = current.next;
            count++;
        }

        System.out.println("Índice inválido.");
	}
	
	 public void displayTasks() {
	        if (head == null) {
	            System.out.println("A lista de tarefas está vazia.");
	            return;
	        }

	        Task current = head;
	        int index = 0;
	        while (current != null) {
	            System.out.println(index + ". " + current);
	            current = current.next;
	            index++;
	        }
	    }
}
