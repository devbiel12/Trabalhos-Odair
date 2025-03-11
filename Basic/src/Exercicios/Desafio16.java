package Exercicios;

import java.util.Scanner;

public class Desafio16 {
    public static void main(String[] args) {
        System.out.println("Quantidade de cigarros fumados por dia:");
        Scanner cigarro = new Scanner(System.in);
        int qtde_cigarro = cigarro.nextInt();

        System.out.println("Quantidade de anos fumando");
        Scanner anos = new Scanner(System.in);
        int qtde_anos = anos.nextInt();
        anos.close();

        int tempo_perdido_dia = 10*qtde_cigarro;
        int qtde_total = tempo_perdido_dia *(365 *qtde_anos);
        int dias_perdido = qtde_total / 1440;

        System.out.println("A quantidade de dias de vida perdidos por fumar "+qtde_cigarro+" por são é "+dias_perdido);

    }

}