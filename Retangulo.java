import java.util.Scanner;
 public class Retangulo { 
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        float n1,n2,area,base, h, soma, perimetro;

        System.out.println("informe os dois valores");
         n1 = in.nextFloat();
         n2 = in.nextFloat();

     area = n1 * n2;
     soma = n1 +n2;
     perimetro =2 * soma;

     System.out.println("A area é: " + area);
     System.out.println(" a perimetro é:  " + perimetro);
 
    }
 }