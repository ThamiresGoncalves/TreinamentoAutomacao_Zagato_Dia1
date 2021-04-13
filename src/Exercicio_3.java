/*Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede)
precisa ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo)
e la (largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp, ha e la,
calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.*/

import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {
        Double hp;
        Double lp;
        Double ha;
        Double la;
        Double areaParede;
        Double areaAzulejo;
        Double qtdAzulejo;


    Scanner ler= new Scanner(System.in);

        System.out.printf("Informe a altura da parede em cm:");
        hp = ler.nextDouble();

        System.out.printf("Informe a largura da parede em cm:");
        lp = ler.nextDouble();

        System.out.printf("Informe a altura do azulejo em cm:");
        ha = ler.nextDouble();

        System.out.printf("Informe a largura da azulejo em cm:");
        la = ler.nextDouble();


        areaParede= hp * lp;
        areaAzulejo= ha * la;
        qtdAzulejo= areaParede / areaAzulejo;

        System.out.println("São necessários " + qtdAzulejo + " azulejos para cobrir a parede de acordo com as dimensões informadas" );

    }
}
