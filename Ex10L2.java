import java.util.Scanner;

public class Ex10L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;
        System.out.print("informe a idade: ");
        idade = in.nextInt();

        if (idade >= 18) {
            System.out.println("adulto");
        }
        if (idade >= 14 && idade < 18) {
            System.out.println("juvenil");
        }
        if (idade >= 9 && idade < 14) {
            System.out.println("infantil");
        }
        if (idade < 9) {
            System.out.println("mirim");
        }

    }
}
