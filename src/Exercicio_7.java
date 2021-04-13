/*7 - Crie um algoritmo que leia o valor do salário-mínimo e o valor do salário de um usuário,
calcule a quantidade de salários-mínimos esse usuário ganha e imprima o resultado. (1SM=R$1100,00)*/


import java.util.Scanner;

public class Exercicio_7 {

    public static void main(String[] args) {

        Double salarioMinimo;
        Double salario;
        Double qtdSalarioMinimo;

        salarioMinimo= 1100d;


        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe o seu salário: R$ ");
        salario = ler.nextDouble();

        qtdSalarioMinimo= salario / salarioMinimo;

        System.out.println("Esse usuário ganha " + qtdSalarioMinimo + " salarios mínimos" );

    }
}
