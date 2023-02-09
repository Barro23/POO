package atividades;
import java.util.Scanner;

public class Atividade4 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("digite a sua altura para saber o seu peso ideal;");
        double a = in.nextDouble(); 
        
        double p = (72.7 * a)- 58;
        
        System.out.println("Seu peso ideal é;" + p);

    }
    
}
