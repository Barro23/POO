package atividade2;

import java.util.Scanner;


public class Atividade3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("digite um numero entre 1 e 10 para fazer sua tabuada;");
        int v = in.nextInt();
        
        for( int n=1; n <= 10; n+=1){ 
            System.out.println(v + " x " + n + " = " + n*v );
            
            
        }
    }
    
}

