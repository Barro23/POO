package atividades;
import java.util.Scanner;

public class Atividade2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("digite a temperatura em Fahrenheit;");
        double f = in.nextDouble(); 
        
        double c = (5 * (f - 32) / 9);
        
        System.out.println("A temperatura de " + f + " Fahrenheits é igual a " + c + " Celsius ");

    }
    
}
