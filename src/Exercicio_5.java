/*5 - Escreva um programa para determinar a quantidade de cavalos necessários para se levantar uma massa
 de m quilogramas a uma altura de h metros em t segundos. Considere cavalos = (m * h / t) / 745,6999
 */

public class Exercicio_5 {

    public static void main(String[] args) {

        Double m;
        Double h;
        Double t;
        Double cavalos;

        m= 45d;
        h= 10.2d;
        t= 8d;
        cavalos= (m * h / t) / 745.6999;

        System.out.println("A quantidade de cavalos necessários é: " + cavalos);
    }
}
