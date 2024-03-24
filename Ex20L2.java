import java.util.Scanner;

public class Ex20L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float valorrecebido, kmgasto, km1, km2, kmfinal, valor, valorfinal, gasolina, litro, kmresultado, valorpago;
        System.out.println("Informe a kilometragem inicial e final: ");
        km1 = in.nextFloat();
        km2 = in.nextFloat();
        System.out.println("Informe quantos litros de gasolina foi usado:");
        litro = in.nextFloat();

        kmfinal = km2 - km1;
        kmresultado = kmfinal / litro;
        kmgasto = kmresultado / litro;
        System.out.println("informe o valor total de corrida realizada:");
        valor = in.nextFloat();
        valorpago = (litro * 4.599f);
        valorrecebido = (valor - valorpago);

        System.out.printf("a media de consumo é: %.2f e o lucro é: R$ %.2f", kmgasto, valorrecebido);

    }
}
