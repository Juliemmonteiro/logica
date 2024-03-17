import java.util.Scanner;

public class Ex16L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float valorprestacao, porcentagem, salario, valoremprestimo, resultado;
        int parcela;
        System.out.println("informe seu salario");
        salario = in.nextFloat();
        System.out.println("informe o valor do emprestimo:");
        valoremprestimo = in.nextFloat();
        System.out.println("Informe o numero de parcelas:");
        parcela = in.nextInt();
        valorprestacao = valoremprestimo / parcela;
        porcentagem = salario * 0.3f;
        if (valorprestacao > porcentagem) {
            System.out.println("emprestimo nao autorizado");

        }
        if (valorprestacao <= porcentagem) {
            System.out.printf("aprovado %f.02", valorprestacao);
        }
    }

}
