package Exercicios;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        System.out.println("Nome do funcionário:");
        Scanner nome = new Scanner(System.in);
        String nomeFuncionario = nome.nextLine();

        System.out.println("Digite a quantidade de dias trabalhados");
        Scanner dia = new Scanner(System.in);
        int qtd_dia = dia.nextInt();
        dia.close();

        int salario = 8 * 25 * qtd_dia;

        System.out.println("O salario de "+nomeFuncionario+" neste mês será "+ NumberFormat.getCurrencyInstance().format(salario));
    }
}
