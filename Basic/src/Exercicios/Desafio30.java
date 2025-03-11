package Exercicios;

import java.util.Scanner;

public class Desafio30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Reta 1: ");
        double R1 = sc.nextInt();

        System.out.println("Reta 2: ");
        double R2 = sc.nextInt();

        System.out.println("Reta 3: ");
        double R3 = sc.nextInt();

        if (R1 + R2 > R3 && R1 + R3 > R2 && R2 + R3 > R1) {
            System.out.println("É possível formar um triângulo");

            if (R1 == R2 && R2 == R3) {
                System.out.println("Tipo do triângulo é Equilátero");
            } else if (R1 == R2 || R1 == R3 || R2 == R3) {
                System.out.println("Tipo do triângulo é Isósceles");
            } else {
                System.out.println("Tipo do triângulo é Escaleno");
            }
        }
        else {
            System.out.println("Não é possível formar um triângulo");
        }

        sc.close();
    }
}