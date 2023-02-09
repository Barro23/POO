package exerciciosaula4;
import java.util.Scanner;

public class Exercicio5 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("digite seu salario para o aumento");
        double n1 = in.nextDouble();


        if(n1 <= 280 ){
            double n2 = ((n1 * 20)/ 100) + n1;
            double a = n2 - n1;
            System.out.println("Salario atual;" + n1);
            System.out.println("o percentual de aumento aplicado; 20%" );
            System.out.println("valor aumento;" + a);
            System.out.println("Salario aumentado;" + n2);
            
            
        }
        else if(n1 >= 281 && n1 <= 700){
            double n2  = ((n1 * 15) /100) + n1;
            double a = n2 - n1;
            System.out.println("Salario atual;" + n1);
            System.out.println("o percentual de aumento aplicado; 15%" );
            System.out.println("valor aumento;" + a);
            System.out.println("Salario aumentado;" + n2);
            
            
        }
        else if(n1 >= 701 && n1 <=1500){
           double n2  = ((n1 * 10) /100) + n1;
           double a = n2 - n1;
           System.out.println("Salario atual;" + n1);
           System.out.println("o percentual de aumento aplicado; 10%" );
           System.out.println("valor aumento;" + a);
           System.out.println("Salario aumentado;" + n2);
             
        }
        else if(n1 >= 1501){
           double n2  = ((n1 * 5) /100) + n1;
           double a = n2 - n1;
           System.out.println("Salario atual;" + n1);
           System.out.println("o percentual de aumento aplicado; 5%" );
           System.out.println("valor aumento;" + a);
           System.out.println("Salario aumentado;" + n2);
             
        }
    }
    
}
