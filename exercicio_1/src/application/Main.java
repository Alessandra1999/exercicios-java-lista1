package application;

import java.util.Scanner;

import entities.TaskManager;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TaskManager task = new TaskManager();
		
		while (true) {
            System.out.println("\nGerenciador de Tarefas:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Exibir Tarefas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1 -> {
                    System.out.print("Digite o título da tarefa: ");
                    String title = sc.nextLine();
                    task.addTask(title);
                }
                case 2 -> {
                    System.out.print("Digite o índice da tarefa a ser removida: ");
                    int index = sc.nextInt();
                    task.removeTask(index);
                }
                case 3 -> {
                    System.out.print("Digite o índice da tarefa a ser marcada como concluída: ");
                    int index = sc.nextInt();
                    task.markTaskAsCompleted(index);
                }
                case 4 -> task.displayTasks();
                case 5 -> {
                    System.out.println("Saindo do gerenciador de tarefas...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
	}
}
