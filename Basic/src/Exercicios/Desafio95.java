package Exercicios;

import java.util.Scanner;

public class Desafio95 {
    public static void Fibonacci(int n) {
        if (n <= 0) {
            System.out.println("Por favor, insira um número maior que 0.");
            return;
        }

        int a = 1, b = 1, c;

        System.out.print(a);
        if (n > 1) {
            System.out.print(" >> " + b);
        }

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" >> " + c);
            a = b;
            b = c;
        }

        System.out.println(" >> FIM");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos termos da sequência de Fibonacci deseja ver? ");
        int n = sc.nextInt();

        Fibonacci(n);

        sc.close();
    }
}