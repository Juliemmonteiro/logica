import java.util.Scanner;

public class Nove {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("informe a quantidade de mulheres:  ");
        int mulher, homem, crianca;
        float carnemulher, carnehomem, carnecrianca, totalcarne, total, totalsoma;
        float totalmulher, totalhomem, totalcrianca;
        float kilos;
        mulher = in.nextInt();
        System.out.println("informe a quantidade de homens: ");
        homem = in.nextInt();
        System.out.println("informe a quantidade de crianças");
        crianca = in.nextInt();
        totalhomem = homem * 400;
        totalmulher = mulher * 320;
        totalcrianca = crianca * 200;
        totalcarne = totalhomem + totalmulher + totalcrianca;
        total = totalcarne * 20 / 100;
        totalsoma = total + totalcarne;
        kilos = totalsoma / 1000;

        System.out.println("total de carne: " + kilos);

    }
}
