import java.util.Scanner;

public class Dez {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float valoringresso, rendatotal, valorsocio, desconto, rendapag, totalsocio, perda;
        float ingcrianca;
        int socio, pagante, crianca, totalpessoas;
        System.out.println("informe o valor do ingresso:");
        valoringresso = in.nextFloat();
        System.out.println("Informe quantidade de sócios: ");
        socio = in.nextInt();
        System.out.println("informe a quantidade de pagantes ");
        pagante = in.nextInt();
        System.out.println("inorme o numero de crianças: ");
        crianca = in.nextInt();
        totalpessoas = socio + pagante + crianca;
        desconto = valoringresso * 30 / 100;
        valorsocio = valoringresso - desconto;
        totalsocio = socio * valorsocio;

        System.out.println("O numero total de pessoas foram: " + totalpessoas);
        rendapag = totalpessoas * valoringresso;
        rendatotal = rendapag + totalsocio;
        System.out.println("Valor total do evento foi: " + rendatotal);
        ingcrianca = crianca * valoringresso;
        perda = totalsocio + ingcrianca;
        System.out.println("A perda de renda foi de:" + perda);

    }
}
