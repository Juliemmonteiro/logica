import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("digite um numero:");
        float numero, resultado;
        float porcentagem;
        numero = in.nextFloat();
        porcentagem = numero * 20 / 100;
        resultado = numero + porcentagem;
        System.out.println("O resultado total é:" + resultado);
    }

}
