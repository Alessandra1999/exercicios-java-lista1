package application;

import java.util.Scanner;

import services.History;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tamanho máximo do histórico: ");
		int maxSize = sc.nextInt();
		sc.nextLine();
		
		History history = new History(maxSize);
		
		while(true) {
            System.out.println("1. Adicionar URL");
            System.out.println("2. Exibir Histórico");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
            case 1 -> {
                System.out.print("Digite a URL a ser adicionada: ");
                String url = sc.nextLine();
                history.addUrl(url);
            }
            case 2 -> history.displayHistory();
            case 3 -> {
                System.out.println("Saindo do histórico de navegação...");
                sc.close();
                return;
            }
            default -> System.out.println("Opção inválida. Tente novamente.");
        }
		}
	}

}
