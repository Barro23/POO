package projeto.pkg1;
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        
        int contador = 0;
        int b = in.nextInt();
        
        int[]vetor = new int [b];
        
        
        for( contador=0; contador < vetor.length; contador++ ){
            vetor[contador] = in.nextInt();
            if(vetor[contador] < 0){
                    System.out.println(vetor[contador]);
            }
        }
          
        
    
    }
        
    }
