package Exercicios;

import java.util.Scanner;

public class Ex08 {
    public void ex08(){
        System.out.println("Digite a quantidade de metros: ");
        Scanner num = new Scanner(System.in);
        int numMetros = num.nextInt();
        num.close();

        int nunCentrimetros = numMetros * 100;

        System.out.println("Distancia em Metros: "+numMetros);
        System.out.println("Distancia em Centimetros: "+nunCentrimetros);
    }
    public static void main(String[] args) {
    Ex08 acessar_exercicio = new Ex08();
    acessar_exercicio.ex08();
    }
}
