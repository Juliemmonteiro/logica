import java.util.Scanner;

public class Ex15L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inicio, hfinal, tempo, positivo;
        System.out.println("informe a hora de inicio e hora do final: ");

        inicio = in.nextInt();
        hfinal = in.nextInt();
        tempo = hfinal - inicio;

        if (tempo <= 24) {
            positivo = tempo*-1;

            System.out.printf("tempo de partida foi: %d h", tempo);
        }

    }

}
