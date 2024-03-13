import java.util.Scanner;

public class Sete {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int distancia, velocidade, tempo;

        System.out.print("informe a distancia: ");
        distancia = in.nextInt();
        System.out.print("informe a velocidade: ");
        velocidade = in.nextInt();
        tempo = distancia / velocidade;

        System.out.print("o tempo de viagem será: " + tempo);
    }

}/// NAO DEU CERTO