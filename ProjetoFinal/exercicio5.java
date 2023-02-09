package projeto.pkg1;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = 1;
        int b;
        while(a != 0){
            a = in.nextInt();  
        if(a != 0){
            b = a * a; 
            System.out.println(b);
        }else{
            System.out.println("");;
        }
      }
    }
}
