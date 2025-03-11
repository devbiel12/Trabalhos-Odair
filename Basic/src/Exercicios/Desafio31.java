package Exercicios;

import java.util.Scanner;
import java.util.Random;

public class Desafio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        System.out.println("Escolha uma opção (0) Pedra, (1) Papel, (2) Tesoura: ");
        int Usuario = sc.nextInt();

        if (Usuario < 0 || Usuario > 2)
        { System.out.println("Escolha inválida.");}
            else {
            int Robo = rand.nextInt(3);

            System.out.println("Você escolheu: " + opcoes[Usuario]);
            System.out.println("Robo escolheu: " + opcoes[Robo]);

            if (Usuario == Robo) {
                System.out.println("Empate!");
            } else if ((Usuario == 0 && Robo == 2) || (Usuario == 1 && Robo == 0) || (Usuario == 2 && Robo == 1)) {
                System.out.println("Você venceu!");
            } else {
                System.out.println("Robo venceu!");
            }

        sc.close();
        }
    }
}