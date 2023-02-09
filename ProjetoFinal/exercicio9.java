package projeto.pkg1;
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        
       int a  = in.nextInt();
       double b = Math.pow(2, a - 1);
       
        System.out.println(b);
    }
}
