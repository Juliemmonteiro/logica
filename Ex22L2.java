import java.util.Scanner;

public class Ex22L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float debito, credito, saldo, saldoatual;
        System.out.println("Informe o valor do seu saldo,credito e debito:");
        saldo = in.nextFloat();
        credito = in.nextFloat();
        debito = in.nextFloat();
        saldoatual = (saldo - debito + credito);
        if (saldoatual >= 0) {
            System.out.println("seu saldo esta positivo");
        } else {
            System.out.println("seu saldo esta negativo");
        }
    }

}