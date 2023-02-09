package exerciciosaula4;
import java.util.Scanner;

public class Exercicio2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("digite um numero");
        int n1 = in.nextInt();

        
        if(n1 < 0){
            System.out.println("o numero " + n1 + " e negativo");
        } else{
            System.out.println("o numero " + n1 + " e positivo");
        }

    }
    
}
