package aula9;
import java.util.Scanner;

public class MainCalcu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int a = 6;
        Calculadora calc1 = new Calculadora();
        
        while(a != 0){
            calc1.menu();
            a = in.nextInt();
            
            if(a == 1){
                System.out.println("digite os numeros para a soma;");
                int b = in.nextInt();
                int c = in.nextInt();
                calc1.soma(b, c);
            }else if(a == 2){
                System.out.println("digite os numeros para o calculo;");
                int b = in.nextInt();
                int c = in.nextInt();
                calc1.subtracao(b, c);
            } else if(a == 3){
                System.out.println("digite os numeros para o calculo;");
                int b = in.nextInt();
                int c = in.nextInt();
                calc1.mutiplicacao(b, c);
            } else if(a == 4){
                System.out.println("digite os numeros para o calculo;");
                int b = in.nextInt();
                int c = in.nextInt();
                calc1.divisao(b, c);
            }else if(a == 5){
                System.out.println("digite os numeros para o calculo;");
                int b = in.nextInt();
                int c = in.nextInt();
                calc1.resto(b, c);
            }
        }
    }
    
}
