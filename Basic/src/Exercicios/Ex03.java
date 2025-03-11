package Exercicios;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex03 {
    public static void main(String []args){
        System.out.println("Nome do funcionário:");
        Scanner nome = new Scanner(System.in);
        String nomeFuncionario = nome.nextLine();

        System.out.println("Salario do funcionário:");
        Scanner sal = new Scanner(System.in);
        double salFuncionario = sal.nextDouble();
        sal.close();//o close() serve para liberar qualquer coisa armazenada para não ocupar memoria e causaar esgotamento na execução

        System.out.println("O funcinario "+nomeFuncionario+" recebe "+ NumberFormat.getCurrencyInstance().format(salFuncionario)); //pega a configuração da maquina e devolve a moeda da lingua que a maquina esta configurada.
    }
}
