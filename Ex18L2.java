import java.util.Scanner;

public class Ex18L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float valor, comissao, taxa, salario, venda, total;
        int quant;

        System.out.println("informe a quantidade: ");
        quant = in.nextInt();
        salario = 1500.00f;
        comissao = 450;
        venda = quant * 1000;
        taxa = (venda * 0.5f);
        total = (salario + comissao + venda + taxa);
        System.out.printf("salario final: R$ %2.0f ", total);
    }
}
