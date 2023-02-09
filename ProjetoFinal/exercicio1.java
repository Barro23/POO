
package projeto.pkg1;
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);    
        double media = 0;
        int idade = 0;
        int contador = 0;
 

        while(true){ 
           idade = in.nextInt(); 
            if(contador == 0 && idade < 0){
                System.out.println("impossivel calcular");
                break;
            }else if(idade < 0){
                break;
            }
          media+= idade;
          contador ++;
            
        }
         System.out.println(media/contador);
    }
}
