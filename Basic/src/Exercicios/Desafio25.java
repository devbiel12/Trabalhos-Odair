package Exercicios;

import java.util.Scanner;

public class Desafio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Reta 1: ");
        double R1 = sc.nextInt();

        System.out.println("Reta 2: ");
        double R2 = sc.nextInt();

        System.out.println("Reta 3: ");
        double R3 = sc.nextInt();

        if(R1+R2 > R3 && R1 + R3 > R2 && R2+R3>R1){
            System.out.println("É possivel formar um triangulo!");
        }else{
            System.out.println("Não é possivel formar um triangulo!");
        }

    }
}
