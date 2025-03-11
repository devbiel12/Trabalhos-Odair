package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {
    public static void  main(String []args){
        System.out.println("Digite a primeira nota: ");
        Scanner n1 = new Scanner(System.in);
        float nota1 = n1.nextFloat();

        System.out.println("Digite a segunda nota: ");
        Scanner n2 = new Scanner(System.in);
        float nota2 = n2.nextFloat();
        n2.close();

        DecimalFormat df = new DecimalFormat("#.#");

        float media = (nota1 + nota2)/2;
        System.out.println("A media de "+nota1+" e "+nota2+" é "+media);
    }
}
