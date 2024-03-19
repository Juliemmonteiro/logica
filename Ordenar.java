import java.util.Scanner;

 public class Ordenar {
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int n1, n2, n3;

      System.out.println("Informe tres numeros: ");
     n1 = in.nextInt();
     n2 = in.nextInt();
      n3 =in.nextInt();
 if(n1 <= n2 && n2 <= n3){
    System.out.printf("%d %d %d",n1,n2,n3);
 }   
 if(n3<= n2 && n2<=n1){
     System.out.printf("%d %d %d",n3,n2,n1);
 } 
 if(n1<= n3 && n3<=n2){
     System.out.printf("%d %d %d",n1,n3,n2);
 }


    }
 }