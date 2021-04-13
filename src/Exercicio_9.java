/*9 - Crie um programa que efetue a leitura de um nome e exiba a mensagem “olá nome informado“*/


import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        String nome;

        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe o seu nome:\n");
        nome = ler.nextLine();

        System.out.println("Olá" + nome);
    }
}
