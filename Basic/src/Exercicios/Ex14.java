package Exercicios;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        System.out.println("Digite a quantidade de KM rodados");
        Scanner kms = new Scanner(System.in);
        double qtd_kms = kms.nextDouble();

        System.out.println("Digite a quantidade de dias alugadas");
        Scanner alugada = new Scanner(System.in);
        int dias_alugadas = alugada.nextInt();
        alugada.close();

        double preco_total = 90*dias_alugadas + 0.20*qtd_kms;
        System.out.println("O valor total a ser pago será "+ NumberFormat.getCurrencyInstance().format(preco_total));


    }
}
