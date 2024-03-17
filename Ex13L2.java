import java.util.Scanner;

public class Ex13L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1, n2, media, mediapassar;
        System.out.println("informe as notas do aluno: ");
        n1 = in.nextFloat();
        n2 = in.nextFloat();
        media = (n1 + n2) / 2;
        if (media >= 6) {
            System.out.println("aprovado: " + media);

        } else {
            System.out.println("Reprovado: " + media);
        }
    }

}
