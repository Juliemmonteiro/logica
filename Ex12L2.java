import java.util.Scanner;

public class Ex12L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int macas;
        double preco1, preco2;
        System.out.println("informe a quantidade de maças: ");
        macas = in.nextInt();
        if (macas >= 12) {
            preco1 = (macas * 1.30);
            System.out.println(" preço total: " + preco1);
        }
        if (macas < 12) {
            preco2 = macas * 1.50;
            System.out.println("preço total: " + preco2);
        }

    }
}
