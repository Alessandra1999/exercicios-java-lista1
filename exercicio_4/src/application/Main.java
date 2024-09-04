package application;

import java.util.Scanner;

import entities.Editor;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Editor editor = new Editor();

		while (true) {
            System.out.println("1. Adicionar texto");
            System.out.println("2. Remover texto");
            System.out.println("3. Desfazer ação");
            System.out.println("4. Refazer ação");
            System.out.println("5. Exibir texto atual");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
            case 1:
                System.out.print("Digite o texto a ser adicionado: ");
                String textToAdd = sc.nextLine();
                editor.addText(textToAdd);
                break;
            case 2:
                System.out.print("Quantos caracteres deseja remover? ");
                int lengthToRemove = sc.nextInt();
                editor.removeText(lengthToRemove);
                break;
            case 3:
                editor.undo();
                System.out.println("Desfeito.");
                break;
            case 4:
                editor.redo();
                System.out.println("Refeito.");
                break;
            case 5:
                System.out.println("Texto atual: " + editor.getCurrentText());
                break;
            case 6:
                System.out.println("Saindo...");
                sc.close();
                return;
            default:
                System.out.println("Opção inválida. Tente novamente.");
            }
		}
	}
}
