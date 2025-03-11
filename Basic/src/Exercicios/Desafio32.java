package Exercicios;

import java.util.Scanner;
import java.util.Random;

public class Desafio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randon = new Random();

       int Sorteado = randon.nextInt(5) + 1;
       int Jogador = 0;

       while (Jogador != Sorteado) {
           System.out.println("Digite um número entre 1 e 5: ");
           Jogador = sc.nextInt();

           if (Jogador < 1 || Jogador > 5)
           { System.out.println("Número inválido, insira um número entre 1 e 5: ");}
           else if (Jogador < Sorteado)
           { System.out.println("Tentativa errada, o número é maior!");}
           else if (Jogador > Sorteado)
           { System.out.println("Tentativa errada, o número é menor");}
           else
           { System.out.println("Parabéns! você acertou o número!");}
       }

    }
}