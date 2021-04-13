/*8 - Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor*/



import java.util.Scanner;

public class Exercicio_8 {

    public static void main(String[] args) {
        Integer numInteiro;
        Integer numAntecessor;
        Integer numSucessor;



        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe um número: ");
        numInteiro = ler.nextInt();

        numAntecessor= numInteiro - 1;
        numSucessor= numInteiro + 1;

        System.out.println("O número antecessor de " + numInteiro + " é " + numAntecessor);
        System.out.println("O número sucessor de " + numInteiro + " é " + numSucessor);

    }
}
