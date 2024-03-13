import java.util.Scanner;

public class Exercicio {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("digite um numero: ");
    int numero;
    int resultado;
    numero = in.nextInt();
    resultado = numero - 1;

    System.out.println("O antecessor e:" + resultado);
  }

}