public class Main {
    public static void main(String []args){
        // Exercicio da aula
        // definições de dois numeros
        int num1 = 10;
        int num2 = 20;

        // Calculando a soma e divisao
        int soma = num1 + num2;
        float divisao_main = (float) num1/num2;

        // Exibindo o resultado
        System.out.println("A soma de " + num1 + " e " + num2 + " é igual a " + soma);
        System.out.println("A divisao de " + num1 + " e " + num2 + " é igual a " + divisao_main);
    }
    public static void divisao(String []args){
        int num3 = 10;
        int num4 = 20;

        // Calculando a soma e divisao
        int soma2 = num3 + num4;
        float divisao2 = (float) num3/num4;

        // Exibindo o resultado
        System.out.println("A soma2 de " + num3 + " e " + num4 + " é igual a " + soma2);
        System.out.println("A divisao2 de " + num4 + " e " + num4 + " é igual a " + divisao2);
    }
}