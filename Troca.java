import java.util.Scanner;

public class Troca {
    public static void main(String[] args){
 Scanner in = new Scanner(System.in);
        int a, b , c;
       

        System.out.println("informe dois numero: ");
        a = in.nextInt();
        b = in.nextInt();

        if(b>a){
        c = a;
        System.out.printf("a=%d,b=%d", a,c);
            } if(a>b) { 
 System.out.printf("a=%d,b=%d", a,b);

            }
            
    }
}