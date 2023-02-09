package Atividade2; 
import java.util.Scanner;

public class Atividade5 { public static void main(String[]args){ 
    Scanner in = new Scanner(System.in);

    System.out.println("quantas pessoas iram informa a idade?;");
    
    
    int resposta = in.nextInt();       
    double media = 0;
    double idade = 0;
    double m = 0;
    
    for(int cont = 1; cont <= resposta; cont++){
        System.out.println("digite sua idade;");
        idade = in.nextInt();
        m = idade + m;

        }
       media = m / resposta; 
    if(media >= 0 && media <=25){ 
        System.out.println("são jovens ");  
      }  
    if (media >= 26 && media <=60){ 
        System.out.println("são adultos ");     
      }
    if (61 < media){ 
        System.out.println("são idosos");
      }
    }
 }
