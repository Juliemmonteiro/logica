import java.util.Scanner;

public class Oito {
    public static void main(String[] args) {
        int total, validos, brancos, nulos;
        float porcentagemvalido, porcentagembranco, porcentagemnulo;
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o numero total de eleitores: ");
        total = in.nextInt();
        System.out.print("informe o numero de votos validos: ");
        validos = in.nextInt();
        System.out.print(" Informe o numero de votos em branco: ");
        brancos = in.nextInt();
        System.out.print("informe o numero de votos nulos: ");
        nulos = in.nextInt();

        porcentagemvalido = validos * 100 / total;
        System.out.println("O numero de votos validos foram: " + porcentagemvalido + '%');
        porcentagembranco = brancos * 100 / total;
        System.out.println("o numero de votos em branco foram:" + porcentagembranco + '%');
        porcentagemnulo = nulos * 100 / total;
        System.out.println("O numero de votos nulos foram: " + porcentagemnulo + '%');

    }

}
