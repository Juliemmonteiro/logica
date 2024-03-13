import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantidade;
        float precosemdesconto, desconto, preco, precocomddesconto, descontofinal, precofinal, ptotal;

        System.out.println("Informe o preço: ");
        preco = in.nextFloat();

        System.out.println("Informe a quantidade: ");
        quantidade = in.nextInt();
        if (quantidade >= 3) {
            ptotal = preco * quantidade;
            desconto = (ptotal * 5 / 100);
            descontofinal = ptotal - desconto;

            System.out.println(" preco total com desconto: " + descontofinal);
        }
        if(quantidade < 3);
        precosemdesconto = preco * quantidade;

        System.out.println("preço final: " + precosemdesconto);
    }
}
