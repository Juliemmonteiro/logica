import java.util.Scanner;

public class Ex11L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, soma, soma1, sub;
        System.out.println(" informe dois numeros: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        soma = n1 + n2;
        if (soma > 20) {
            soma1 = soma + 8;
            System.out.println("resultado: " + soma1);
        }
        if (soma <= 20) {
            sub = soma - 10;
            System.out.println("resultado é: " + sub);
        }
    }
}
