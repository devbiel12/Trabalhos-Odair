package Exercicios;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        System.out.println("Digite o valor de A da equação: ");
        Scanner num1 = new Scanner(System.in);
        int A = num1.nextInt();

        System.out.println("Digite o valor de B da equação: ");
        Scanner num2 = new Scanner(System.in);
        int B = num2.nextInt();

        System.out.println("Digite o valor de C da equação: ");
        Scanner num3 = new Scanner(System.in);
        int C = num3.nextInt();
        num3.close();

        int delta = (B*B)-4*A*C;
        System.out.println("O valor de delta da expressão "+A+"x²+("+B+")x+("+C+") é "+delta);

    }
}
