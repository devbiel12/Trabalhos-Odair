package Exercicios;

import java.util.Scanner;

public class Ex04 {
    public void ex04(){
        System.out.println("Digite o primeiro numero: ");
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();

        System.out.println("Digite o segundo numero: ");
        Scanner n2 = new Scanner(System.in);
        int num2 = n2.nextInt();
        n2.close();

        int soma = num1 + num2;
        System.out.println("A soma de "+num1+" e "+num2+" é "+soma);
    }
    public static void  main(String []args){
       Ex04 acessa_exercicio = new Ex04();
       acessa_exercicio.ex04();
    }
}
