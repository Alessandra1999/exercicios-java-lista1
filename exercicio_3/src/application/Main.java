package application;

import java.util.Scanner;
import services.Editor;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Editor textEditor = new Editor();
		
		while(true) {
			System.out.println("1. Inserir Texto");
            System.out.println("2. Remover Texto");
            System.out.println("3. Desfazer Ação");
            System.out.println("4. Exibir Texto Atual");
            System.out.println("5. Exibir Ações Realizadas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
            case 1 -> {
                System.out.print("Digite o texto a ser inserido: ");
                String text = sc.nextLine();
                textEditor.insertText(text);
            }
            case 2 -> {
                System.out.print("Digite o número de caracteres a remover: ");
                int length = sc.nextInt();
                textEditor.deleteText(length);
            }
            case 3 -> textEditor.undo();
            case 4 -> textEditor.displayText();
            case 5 -> textEditor.displayActions();
            case 6 -> {
                System.out.println("Saindo do editor de texto...");
                sc.close();
                return;
            }
            default -> System.out.println("Opção inválida. Tente novamente.");
           }
		}
	}
}
