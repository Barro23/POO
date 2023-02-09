package atividade2;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        

        
        while(true){ 
            
        System.out.println("digite a sua nota entre 0 e 10;");
        double nota = in.nextDouble();            
        
            if(nota < 0 || nota > 10){
                System.out.println("seu numero não esta entre 0 e 10, digite novamente a nota;");
            }else {
                break;
            }
            
        }
    }
    
}
