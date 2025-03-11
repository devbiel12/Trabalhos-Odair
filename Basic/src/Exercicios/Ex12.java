package Exercicios;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        System.out.println("Digite o nome do produto: ");
        Scanner nome = new Scanner(System.in);
        String nome_produto = nome.nextLine();

        System.out.println("Digite o valor do produto: ");
        Scanner valor = new Scanner(System.in);
        float valor_produto = valor.nextFloat();
        valor.close();

        float valor_promo = valor_produto - (valor_produto* 0.05f);
        System.out.println("O valor promocional de "+nome_produto+" é igual a "+valor_promo);
    }
}
