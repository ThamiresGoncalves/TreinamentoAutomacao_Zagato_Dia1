/*10 - Crie um programa que exiba a tabuada de um número informado pelo usuário*/


import java.util.Scanner;

public class Exercicio_10 {

    public static void main(String[] args) {
        Integer numero;

        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe um número: ");
        numero = ler.nextInt();


        System.out.println("Segue abaixo a tabuada do número " + numero + ":");
        System.out.println();

        System.out.println(numero + " x 1= " + numero * 1);
        System.out.println();

        System.out.println(numero + " x 2= " + numero * 2);
        System.out.println();

        System.out.println(numero + " x 3= " + numero * 3);
        System.out.println();

        System.out.println(numero + " x 4= " + numero * 4);
        System.out.println();

        System.out.println(numero + " x 5= " + numero * 5);
        System.out.println();

        System.out.println(numero + " x 6= " + numero * 6);
        System.out.println();

        System.out.println(numero + " x 7= " + numero * 7);
        System.out.println();

        System.out.println(numero + " x 8= " + numero * 8);
        System.out.println();

        System.out.println(numero + " x 9= " + numero * 9);
        System.out.println();

        System.out.println(numero + " x 10= " + numero * 10);
        System.out.println();
    }
}
