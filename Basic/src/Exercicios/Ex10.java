package Exercicios;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println("Digite a largura da parede");
        Scanner larg = new Scanner(System.in);
        float largura = larg.nextFloat();

        System.out.println("Digite a altura da parede");
        Scanner alt = new Scanner(System.in);
        float altura = larg.nextFloat();
        alt.close();

        float area = altura * largura;
        float qtd_tinta = area/2;

        System.out.println("A area a ser pintada é de "+area+"m² e a quantidade de latas de tinta para pintar a parede será "+qtd_tinta+" baldes de tinta");
    }
}
