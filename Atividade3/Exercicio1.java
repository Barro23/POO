package exerciciosaula4;
import java.util.Scanner;

public class Exercicio1 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("digite o primeiro numero para comparar");
        int n1 = in.nextInt();
        System.out.println("digite o segundo numero para comparar");
        int n2 = in.nextInt();
        
        if(n1 >= n2){
            System.out.println("o maior numero é;" + n1);
        } else{
            System.out.println("o maior numero é;" + n2);
        }

    }
    
}
