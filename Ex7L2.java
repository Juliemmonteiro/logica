import java.util.Scanner;

public class Ex7L2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float ganhah, salario, imposto, salarioimposto;
        int hh;
        System.out.println("informe quanto ganha por hora e quantas oras por mes;");
        ganhah = in.nextFloat();
        hh = in.nextInt();
        salario = ganhah * hh;
        imposto = (salario * 15 / 100);
        salarioimposto = salario - imposto;
        System.out.println("Seu salario é:" + salario);
        System.out.println("Seu salario com desconto é :" + salarioimposto);
    }
}