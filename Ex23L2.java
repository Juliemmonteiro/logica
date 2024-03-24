import java.util.Scanner;

public class Ex23L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int estoqueatual, minimo, maximo, estoquemedio;
        System.out.println("informe a quantidade do estoque atual, a quantidade minima e maxima:");
        estoqueatual = in.nextInt();
        minimo = in.nextInt();
        maximo = in.nextInt();
        estoquemedio = (minimo + maximo) / 2;
        if (estoqueatual >= estoquemedio) {
            System.out.print("Não efetuar compra");
        }
        if (estoqueatual <= estoquemedio) {
            System.out.print("efetuar compra");
        }

    }
}