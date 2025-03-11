package Exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ex09 {
    public void ex09() {
        System.out.println("Digite o valor em reais: ");
        Scanner num = new Scanner(System.in);
        float reais = num.nextFloat();
        num.close();
        DecimalFormat df = new DecimalFormat("#.##");

        float dolar = reais/ 5.71f ;
        System.out.println("A quantidade de dolares que o usuario conseguira comprar com "+ NumberFormat.getCurrencyInstance().format(reais)+" é $"+df.format(dolar));

    }
    public static void main(String[] args) {
        Ex09 acessar_exercicio = new Ex09();
        acessar_exercicio.ex09();
    }
}
