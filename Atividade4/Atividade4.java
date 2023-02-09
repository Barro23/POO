package Atividade2; 
import java.util.Scanner;

public class Atividade4 { public static void main(String[]args){ 
    Scanner in = new Scanner(System.in);

    System.out.println("quantas notas vc quer calcular?;");
    
    
    int resposta = in.nextInt();       
    double media = 0;
    double n = 0;
    double m = 0;
    
    for(int cont = 1; cont <= resposta; cont++){
        System.out.println("digite a nota;");
        n = in.nextInt();
        m = n + m;

        

    }
       media = m / resposta; 
       System.out.println(media); 
  }        
           
 }


