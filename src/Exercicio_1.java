/* 1 - Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em
Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas:
F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67 */

public class Exercicio_1 {

    public static void main(String[] args) {
        Double C;
        Double F;
        Double K;
        Double Re;
        Double Ra;

        C = 36d;
        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;

        System.out.println("Temperatura em Fahrenheit (F):");
        System.out.println(F);
        System.out.println("Temperatura em Kelvin (K):");
        System.out.println(K);
        System.out.println("Temperatura em Réaumur (Re):");
        System.out.println(Re);
        System.out.println("Temperatura em Rankine (Ra):");
        System.out.println(Ra);

    }
}


