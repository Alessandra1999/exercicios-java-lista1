package application;

import java.util.Scanner;

import entities.Card;
import entities.Hand;

public class Main {
    public static void main(String[] args) {
        Hand hand = new Hand();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Adicionar uma carta");
            System.out.println("2. Remover uma carta");
            System.out.println("3. Mover uma carta");
            System.out.println("4. Mostrar cartas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Digite o valor da carta(Ás, 1, 2, Rainha, Rei...): ");
                    String value = sc.nextLine();
                    System.out.print("Digite o naipe da carta(Espadas, Paus, Ouros e Copas): ");
                    String suit = sc.nextLine();
                    hand.addCard(new Card(value, suit));
                    break;
                case 2:
                    System.out.print("Digite o valor da carta a ser removida: ");
                    String removeValue = sc.nextLine();
                    System.out.print("Digite o naipe da carta a ser removida: ");
                    String removeSuit = sc.nextLine();
                    hand.removeCard(removeValue, removeSuit);
                    break;
                case 3:
                    System.out.print("Digite o valor da carta a ser movida: ");
                    String moveValue = sc.nextLine();
                    System.out.print("Digite o naipe da carta a ser movida: ");
                    String moveSuit = sc.nextLine();
                    System.out.print("Digite a nova posição da carta: ");
                    int newPosition = sc.nextInt();
                    sc.nextLine();
                    hand.moveCard(moveValue, moveSuit, newPosition);
                    break;
                case 4:
                    hand.showHand();
                    break;
                case 5:
                    running = false;
                    System.out.println("Saindo do jogo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        sc.close();
    }
}
