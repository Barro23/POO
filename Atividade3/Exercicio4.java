package exerciciosaula4;
import java.util.Scanner;

public class Exercicio4 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("digite um numero");
        double n1 = in.nextDouble();
        System.out.println("digite um numero");
        double n2 = in.nextDouble();
        System.out.println("digite um numero");
        double n3 = in.nextDouble();
        
        
        if(n1 > n2 && n1 > n3){
            System.out.println("maior numero;" + n1);
            if(n2 < n3){
                System.out.println("menor numero;" + n2);
            } else {System.out.println("maior numero;" + n3);}
            
        } else if (n2 > n1 && n2 > n3){
            System.out.println("maior numero;" + n2);
            if(n3 < n1){
                System.out.println("menor numero;" + n3);
            } else {System.out.println("maior numero;" + n1);}
            
            
        } else if(n3 > n1 && n3 > n2){
            System.out.println("maior numero;" + n3);
            if(n1 < n2){
                System.out.println("menor numero;" + n1);
            } else {System.out.println("maior numero;" + n2);}
            
    }

    }
    
}
