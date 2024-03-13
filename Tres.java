import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero, resultado;
        numero = in.nextInt();
        resultado = numero * 2;
        System.out.println(" o resultado final:" + resultado);

    }

}