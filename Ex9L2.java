
import java.util.Scanner;

public class Ex9L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double raio, area, comprimento, pi;
        System.out.println("Informe  raio: ");
        pi = 3.141692;
        raio = in.nextDouble();
        area = pi * (raio * raio);
        comprimento = 2 * pi * raio;
        System.out.printf("%.2f area", area);
        System.out.printf(" %.2f comprimento", comprimento);
    }
}
