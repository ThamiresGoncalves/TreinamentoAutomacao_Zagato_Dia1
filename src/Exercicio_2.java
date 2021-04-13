/* 2 - Criar um programa que calcule a média de salários de uma empresa,
pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial*/


import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {

        Integer quantidade;
        Double totalSalario;


        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe a quantidade de funcionários da empresa: ");
        quantidade = ler.nextInt();

        System.out.printf("Informe o salário total dos funcionários: R$ ");
        totalSalario = ler.nextDouble();


        System.out.println("A média salarial dos funcionários é: R$" + totalSalario / quantidade);


    }
}
