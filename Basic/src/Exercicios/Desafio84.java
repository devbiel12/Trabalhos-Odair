package Exercicios;
import java.util.Arrays;
import java.util.Random;

public class Desafio84 {
    public static void main(String[] args) {
        Random randon = new Random();
        int[] vetor = new int[20];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = randon.nextInt(100);
        }


        System.out.println("Números gerados:");
        System.out.println(Arrays.toString(vetor));// Para transformar o vetor em string, usasse o codigo toString

        Arrays.sort(vetor); // semelhante ao .sort() do python, ele ordena o vetor a partir de algoritmos de ordenação implementados na função

        System.out.println("Números ordenados:");
        System.out.println(Arrays.toString(vetor));
    }
}
