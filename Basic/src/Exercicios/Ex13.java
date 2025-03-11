package Exercicios;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex13 {
    public static void main(String []args){
        System.out.println("Nome do funcionário que receberá aumento:");
        Scanner nome = new Scanner(System.in);
        String nomeFuncionario = nome.nextLine();

        System.out.println("Salario do funcionário:");
        Scanner sal = new Scanner(System.in);
        double salFuncionario = sal.nextDouble();
        sal.close();//o close() serve para liberar qualquer coisa armazenada para não ocupar memoria e causaar esgotamento na execução

        double salario_novo = salFuncionario + salFuncionario * 0.15;
        System.out.println("O funcinario "+nomeFuncionario+" receberá daqui em diante "+ NumberFormat.getCurrencyInstance().format(salario_novo)); //pega a configuração da maquina e devolve a moeda da lingua que a maquina esta configurada.
    }
}