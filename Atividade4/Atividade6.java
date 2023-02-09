package Atividade2; 
import java.util.Scanner;

public class Atividade6 { public static void main(String[]args){ 
    Scanner in = new Scanner(System.in);

    System.out.println("quantas numeros vc vai querer somar?;");

    
    int resposta = in.nextInt();       
    double media = 0;
    double n = 0;
    double m = 0;
    System.out.println("digite os numeros ;");
    for(int cont = 1; cont <= resposta; cont++){;
        n = in.nextInt();
        m = n + m;

        

    }
       media = m / resposta; 
       System.out.println("soma dos seus numeros é igual a;" + m); 
  }        
           
 }