package Exercicios;

import java.util.Scanner;

public class Ex07 {
    public void ex07(){
        System.out.println("Digite um numero: ");
        Scanner num = new Scanner(System.in);
        float numero = num.nextFloat();
        num.close();

        float dobro = numero * 2;
        float terca_parte = numero / 3;

        System.out.println("O dobro de "+numero+" é "+dobro);
        System.out.println("A terça parte de "+numero+" é "+terca_parte);
    }
    public static void main(String[] args) {
        Ex07 acessar_exercicio = new Ex07();
        acessar_exercicio.ex07();
    }
}
