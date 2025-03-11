package Exercicios;

import java.util.Scanner;
import java.util.Random;

public class Desafio56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randon = new Random();

        int Sorteado = randon.nextInt(10) + 1; 
        int Jogador;
        int tentativas = 4;

        System.out.println("Tente adivinhar o número entre 1 e 10! Você tem 4 tentativas.");

        while (tentativas > 0) {
            System.out.print("Digite um número entre 1 e 10: ");
            Jogador = sc.nextInt();

            if (Jogador < 1 || Jogador > 10) {
                System.out.println("Número inválido, insira um número entre 1 e 10.");
            } else if (Jogador < Sorteado) {
                System.out.println("Tentativa errada! O número é maior.");
            } else if (Jogador > Sorteado) {
                System.out.println("Tentativa errada! O número é menor.");
            } else {
                System.out.println("Parabéns! Você acertou o número!");
                break;
            }

            tentativas--;

            if (tentativas > 0) {
                System.out.println("Você tem mais " + tentativas + " tentativa(s).");
            } else {
                System.out.println("Suas tentativas acabaram! O número era " + Sorteado + ".");
            }
        }

        sc.close();
    }
}
