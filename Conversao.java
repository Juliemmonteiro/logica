import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int segundos, ss, mm, hh, resto;
        System.out.println("Informe o tempo em segundos:");
        segundos = in.nextInt();
        hh = segundos / 3600;

        resto = segundos % 3600;
        mm = resto / 60;

        ss = resto % 60;
        System.out.println("horas: " + hh);
        System.out.println(" minutos: " + mm);
        System.out.println("segundos: " + ss);

        System.out.printf("\n\t %02d : %02d : %02d\n\n", hh, mm, ss);

    }
}
