/*11 - Crie um programa que calcule a média de um aluno para a matéria de matemática.
O aluno deve informar seu nome e as quatro notas da matéria.*/


import java.util.Scanner;

public class Exercicio_11 {

    public static void main(String[] args) {
        String nome;
        Double nota1;
        Double nota2;
        Double nota3;
        Double nota4;
        Double media;

        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe o seu nome: ");
        nome = ler.nextLine();

        System.out.printf("Informe a sua primeira nota de matemática: ");
        nota1 = ler.nextDouble();

        System.out.printf("Informe a sua segunda nota de matemática: ");
        nota2 = ler.nextDouble();

        System.out.printf("Informe a sua terceira nota de matemática: ");
        nota3 = ler.nextDouble();

        System.out.printf("Informe a sua quarta nota de matemática: ");
        nota4 = ler.nextDouble();


        media= (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println(nome + " sua média em matemática é: " + media);

    }

}
