import java.util.Scanner;

public class Ex19L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quant, caixa5;
        float caixa, caixa1, compr, soma1, largura1, largura2, largura3, largura4, altura, piso, soma, paredetotal,
                parede1, parede2, parede3, parede4;
        System.out.println("informe o comprimento e altura da cozinha: ");
        System.out.println("informe as larguras de cada parede: ");
        compr = in.nextFloat();
        largura1 = in.nextFloat();
        altura = in.nextFloat();
        largura2 = in.nextFloat();
        largura3 = in.nextFloat();
        largura4 = in.nextFloat();
        piso = largura1 * compr;
        soma = piso * 0.05f;
        parede1 = largura1 * altura;
        parede2 = largura2 * altura;
        parede3 = largura3 * altura;
        parede4 = largura4 * altura;
        paredetotal = parede1 + parede2 + parede3 + parede4;
        soma1 = paredetotal * 0.05f;
        caixa = soma1 + paredetotal;
        caixa1 = (caixa / 1.5f);
        caixa5 = (int) caixa1;
        System.out.println("quantidade de caixa é: " + caixa5);
    }
}
