package Exercicios;

import java.util.Scanner;

public class Ex06 {
    public void ex06(){
        System.out.println("Digite um numero: ");
        Scanner num = new Scanner(System.in);
        int numero = num.nextInt();
        num.close();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor de "+numero+" é "+antecessor);
        System.out.println("O sucessor de "+numero+" é "+sucessor);
    }
    public static void main(String []args){
        Ex06 acessar_exercicio = new Ex06();
        acessar_exercicio.ex06();
    }
}
