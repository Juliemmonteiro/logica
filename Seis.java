import java.util.Scanner;

public class Seis {

    public static void main(String[] args) {
        System.out.println("informe a primeira nota ");

        float primeira, segunda;
        System.out.println("informe a segunda nota: ");
        float media;
        Scanner in = new Scanner(System.in);
        primeira = in.nextFloat();
        segunda = in.nextFloat();
        media = primeira + segunda / 2;
        System.out.println("a media é: " + media);
    }

}