import java.util.Scanner;

public class Ex14L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anoatual, idade, anonasc;
        System.out.println("informe o ano atual e ano de nascimento: ");
        anoatual = in.nextInt();
        anonasc = in.nextInt();

        idade = anoatual - anonasc;
        if (idade >= 16) {
            System.out.println("pode votar esse ano:");
        } else {
            System.out.println("não pode votar esse ano");
        }
    }
}
