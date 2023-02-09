package aula7;
import java.util.Scanner;

public class atividade5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[]a = new int[10];
  
        
        System.out.println("digite os valores para saber se é palíndromo ou não");
        a[0] = in.nextInt();
        a[1] = in.nextInt();
        a[2] = in.nextInt();
        a[3] = in.nextInt();
        a[4] = in.nextInt();
        a[5] = in.nextInt();
        a[6] = in.nextInt();
        a[7] = in.nextInt();
        a[8] = in.nextInt();
        a[9] = in.nextInt();

   
        

        if( a[0] != a[9] )
        {
            System.out.println("não é um palíndromo"); 
            
        }
        else if( a[1] != a[8] )
        {
            System.out.println("não é um palíndromo");   
        }  
        else if( a[2] != a[7] )
        {
            System.out.println("não é um palíndromo");   
        } 
        else if( a[3] != a[6] )
        {
            System.out.println("não é um palíndromo");   
        } 
        else if( a[4] != a[5] )
        {
            System.out.println("não é um palíndromo");   
        } else{
            System.out.println("é um palíndromo"); 
        }
      
        
    }
    }

  