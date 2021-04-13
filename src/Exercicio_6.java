/*6 - Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.*/



public class Exercicio_6 {

    public static void main(String[] args) {

        Double mediaUm;
        Double mediaDois;
        Double somaDuasMedias;
        Double mediaDaMedia;

        mediaUm= (8 + 9 + 7) / 3d;
        mediaDois= (4 + 5 + 6) / 3d;
        somaDuasMedias= mediaUm + mediaDois;
        mediaDaMedia= somaDuasMedias / 2d;

        System.out.println(" A média aritmética dos números 8, 9 e 7 é: " + mediaUm);
        System.out.println(" A média aritmética dos números 4, 5 e 6 é: " + mediaDois);
        System.out.println(" A soma das duas médias é: " + somaDuasMedias);
        System.out.println(" A média das médias é: " + mediaDaMedia);

    }
}
