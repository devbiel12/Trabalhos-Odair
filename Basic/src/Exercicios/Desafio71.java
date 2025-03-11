package Exercicios;

public class Desafio71 {
    public void fibonacci() {
        int a = 1, b = 1, c;

        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 10; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Desafio71 acessar_exercicio = new Desafio71();
        acessar_exercicio.fibonacci();
    }
}