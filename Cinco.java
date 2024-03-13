import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("informe a temperatura");
        float temperatura, f;
        f = in.nextFloat();
        temperatura = ((f - 32) * 5 / 9);
        System.out.println(" temperatura em celsius:" + temperatura);

    }
}