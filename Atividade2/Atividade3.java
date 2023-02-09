package atividades;
import java.util.Scanner;

public class Atividade3 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("digite um numero inteiro;");
        int n1 = in.nextInt(); 
        
        System.out.println("digite um numero inteiro;");
        int n2 = in.nextInt(); 
        
        System.out.println("digite um numero real;");
        float n3 = in.nextFloat(); 
        
        double produto = (n1 * 2) * (n2 / 2);
        System.out.println("o produto do dobro do primeiro com metade do segundo é" + produto);
        
        double soma = (3 * n1) + n3;
        System.out.println("a soma do triplo do primeiro com o terceiro é;" + soma);
        
        double cubo = Math.pow(n3, 3.0);
        System.out.println("o terceiro elevado ao cubo é;" + cubo);

    }
    
}

