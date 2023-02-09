package projeto.pkg1;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        
       double nota1;
       double nota2;
       double media;
       int c = 0;
       
    while(true){
        nota1 = in.nextDouble();
        nota2 = in.nextDouble();
        if(nota1 < 0 || nota2 < 0){
          System.out.println("nota invalida");  
        }
        else if( nota1 <= 10 || nota2 <= 10){
          media = (nota1 + nota2) / 2;
          System.out.println("media = " + media);
          System.out.println("novo calculo (1-sim 2-nao)");
          c = in.nextInt();
        }if(c == 2){
          break;
        }
    }
  }
}
