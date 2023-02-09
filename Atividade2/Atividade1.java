package Atividades; 
import java.util.Scanner;

public class Atividade1 { public static void main(String[]args){ 
    Scanner in = new Scanner(System.in);

        System.out.println("digite o valor da nota 1;");
        double valor1 = in.nextDouble();
       
        System.out.println("digite o valor da nota 2;");
        double valor2 = in.nextDouble();
        
        System.out.println("digite o valor da nota 3;");
        double valor3 = in.nextDouble();
        
        System.out.println("digite o valor da nota 4;");
        double valor4 = in.nextDouble();  
        
        double media = (valor1 + valor2 + valor3 + valor4) / 4;

        
        System.out.println(" a sua média final é" + media) ;

}
}
